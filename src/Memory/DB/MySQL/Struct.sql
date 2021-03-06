/**
 * @copyright (c) 2014, by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
*/

/**
 * Create database
 */
 
CREATE DATABASE pharmacy_finance
    DEFAULT
        CHARACTER SET utf8
        COLLATE utf8_general_ci;

/**
* Create a user
*/

CREATE USER valentine@localhost IDENTIFIED BY 'valentine';


/**
* Grant privileges
*/
GRANT ALL ON pharmacy_finance.* TO valentine@localhost;

USE pharmacy_finance;

/* //- SECTION :: TABLES -// */

/** *** *** *** *** *** *** *** *** *** *
 * User
 *  --- --- --- --- --- --- --- --- --- *
 * Data about users
*/

CREATE TABLE user(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    first_name VARCHAR(32) NOT NULL,

    last_name VARCHAR(32) NOT NULL,

    login VARCHAR(32) NOT NULL,

    email VARCHAR(32) NOT NULL,

    password VARCHAR NOT NULL,

    enabled BOOLEAN NOT NULL,

    PRIMARY KEY( id )
) ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Role
 *  --- --- --- --- --- --- --- --- --- *
 * Content data about roles.
 * Ex.: ADMIN, ACCOUNTANT, USER
* *** *** *** *** *** *** *** *** *** *** /
*/

CREATE TABLE role(
  id            BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

  authority     VARCHAR(45) NOT NULL,

  PRIMARY KEY( id )

) ENGINE = InnoDB CHARACTER SET = utf8;

CREATE TABLE user_roles(

  user_id       BIGINT( 20 ) NOT NULL,

  role_id       BIGINT( 20 ) NOT NULL,
  
  FOREIGN KEY( user_id ) REFERENCES user( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

  FOREIGN KEY( role_id ) REFERENCES role( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8;


/** *** *** *** *** *** *** *** *** *** *
 * Year
 *  --- --- --- --- --- --- --- --- --- *
 * Data about available years of records
*/

CREATE TABLE year(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        INT( 4 ) NOT NULL UNIQUE,

    PRIMARY KEY( id )
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Accounting_system
 *  --- --- --- --- --- --- --- --- --- *
 * Data about accounting system
*/

CREATE TABLE accounting_system(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 16 ) NOT NULL UNIQUE,

    PRIMARY KEY( id )
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Income_expense_clause
 *  --- --- --- --- --- --- --- --- --- *
 * Data about clause of income/expense
*/

CREATE TABLE income_expense_clause(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 16 ) NOT NULL UNIQUE,

    PRIMARY KEY( id )
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Distribution_way
 *  --- --- --- --- --- --- --- --- --- *
 * Data about distribution ways
*/

CREATE TABLE distribution_way(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 32 ) NOT NULL UNIQUE,

    PRIMARY KEY( id )
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Pharmacy
 *  --- --- --- --- --- --- --- --- --- *
 * Data about pharmacies
*/

CREATE TABLE pharmacy(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    shortname   VARCHAR( 32 ) NOT NULL UNIQUE,

    name        VARCHAR( 32 ) NOT NULL UNIQUE,

    legal_form  VARCHAR( 8 ) NOT NULL,

    region      VARCHAR( 32 ) NOT NULL,

    calculation_consider BOOLEAN NOT NULL,

    PRIMARY KEY( id )
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Profit
 *  --- --- --- --- --- --- --- --- --- *
 * Data about profit of pharmacies
*/

CREATE TABLE profit(
    id            BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    year_id       BIGINT( 20 ) NOT NULL,

    pharmacy_id   BIGINT( 20 ) NOT NULL,

     month         VARCHAR( 16 )  NOT NULL,

    profit        DOUBLE NOT NULL,

    PH            DOUBLE NOT NULL,

    GI            DOUBLE  NOT NULL,

    GI_BONUS      DOUBLE,

    GI_DEPOSIT    DOUBLE,

    GI_ANOTHER1   DOUBLE,

    GI_ANOTHER2   DOUBLE,

    GI_TOTAL      DOUBLE  NOT NULL,

    PRIMARY KEY( id ),

    FOREIGN KEY( year_id ) REFERENCES year( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

    FOREIGN KEY( pharmacy_id ) REFERENCES pharmacy( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
ENGINE = InnoDB CHARACTER SET = utf8;

/** *** *** *** *** *** *** *** *** *** *
 * Expense
 *  --- --- --- --- --- --- --- --- --- *
 * Data about expenses of pharmacies
*/

CREATE TABLE expense(
    id            BIGINT( 20 )  NOT NULL AUTO_INCREMENT,

    month         VARCHAR( 16 )  NOT NULL,

    year_id       BIGINT( 20 ) NOT NULL,

    accounting_system_id        BIGINT( 20 ) NOT NULL,

    distribution_way_id         BIGINT( 20 ) NOT NULL,

    income_expense_clause_id    BIGINT( 20 ) NOT NULL,

    name          VARCHAR( 100 ) NOT NULL,
    
    sum           DOUBLE NOT NULL,

    income        BOOLEAN NOT NULL,

    PRIMARY KEY( id ),
    
    FOREIGN KEY( year_id ) REFERENCES year( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
        
    FOREIGN KEY( accounting_system_id ) REFERENCES accounting_system( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

    FOREIGN KEY( income_expense_clause_id ) REFERENCES income_expense_clause( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
        
    FOREIGN KEY( distribution_way_id ) REFERENCES distribution_way( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
ENGINE = InnoDB CHARACTER SET = utf8;







