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

-- /**
--  * Create a user
--  */
--
-- CREATE USER pharmacy_finance@localhost IDENTIFIED BY 'pharmacy_finance';
--
-- /**
--  * Grant privileges
--  */
-- GRANT ALL ON pharmacy_finance.* TO pharmacy_finance@localhost;


/* //- SECTION :: TABLES -// */

/** *** *** *** *** *** *** *** *** *** *
 * Role
 *  --- --- --- --- --- --- --- --- --- *
 * Content data about roles.
 * Ex.: ADMIN, ACCOUNTANT, USER
* *** *** *** *** *** *** *** *** *** *** /
*/



/** *** *** *** *** *** *** *** *** *** *
 * Year
 *  --- --- --- --- --- --- --- --- --- *
 * Data about available years of records
*/

CREATE TABLE year(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        INT( 4 ) NOT NULL,

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

    name        VARCHAR( 16 ) NOT NULL,

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

    name        VARCHAR( 16 ) NOT NULL,

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

    name        VARCHAR( 32 ) NOT NULL,

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

    shortname   VARCHAR( 32 ) NOT NULL,

    name        VARCHAR( 32 ) NOT NULL,

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

    accounting_system_id        BIGINT( 20 ) NOT NULL,

    pharmacy_id   BIGINT( 20 ) NOT NULL,

    profit        FLOAT NOT NULL,

    PH            FLOAT NOT NULL,

    GI            FLOAT NOT NULL,

    GI_BONUS      FLOAT NOT NULL,

    GI_DEPOSIT    FLOAT NOT NULL,

    GI_ANOTHER1   FLOAT NOT NULL,

    GI_ANOTHER2   FLOAT NOT NULL,

    GI_TOTAL      FLOAT NOT NULL,

    PRIMARY KEY( id ),

    FOREIGN KEY( year_id ) REFERENCES year( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

    FOREIGN KEY( accounting_system_id ) REFERENCES accounting_system( id )
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

    name          VARCHAR( 100 ),

    PRIMARY KEY( id ),
    
    FOREIGN KEY( year_id ) REFERENCES year( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
        
    FOREIGN KEY( accounting_system_id ) REFERENCES accounting_system( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
        
    FOREIGN KEY( distribution_way_id ) REFERENCES distribution_way( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
ENGINE = InnoDB CHARACTER SET = utf8;







