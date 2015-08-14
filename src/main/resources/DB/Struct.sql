

CREATE TABLE year(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        INT( 4 ) NOT NULL,

    PRIMARY KEY( id )
);


CREATE TABLE accounting_system(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 16 ) NOT NULL,

    PRIMARY KEY( id )
);


CREATE TABLE income_expense_clause(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 16 ) NOT NULL,

    PRIMARY KEY( id )
);


CREATE TABLE distribution_way(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    name        VARCHAR( 32 ) NOT NULL,

    PRIMARY KEY( id )
);

CREATE TABLE pharmacy(
    id          BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    shortname   VARCHAR( 32 ) NOT NULL,

    name        VARCHAR( 32 ) NOT NULL,

    legal_form  VARCHAR( 8 ) NOT NULL,

    region      VARCHAR( 32 ) NOT NULL,

    calculation_consider BOOLEAN NOT NULL,

    PRIMARY KEY( id )
);


CREATE TABLE profit(
    id            BIGINT( 20 ) NOT NULL AUTO_INCREMENT,

    year_id       BIGINT( 20 ) NOT NULL,

    pharmacy_id   BIGINT( 20 ) NOT NULL,

    month         VARCHAR( 16 )  NOT NULL,

    profit        DOUBLE NOT NULL,

    PH            DOUBLE NOT NULL,

    GI            DOUBLE  NOT NULL,

    GI_BONUS      DOUBLE  ,

    GI_DEPOSIT    DOUBLE  ,

    GI_ANOTHER1   DOUBLE  ,

    GI_ANOTHER2   DOUBLE  ,

    GI_TOTAL      DOUBLE  ,

    PRIMARY KEY( id ),

    FOREIGN KEY( year_id ) REFERENCES year( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

    FOREIGN KEY( pharmacy_id ) REFERENCES pharmacy( id )
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);


CREATE TABLE expense(
    id            BIGINT( 20 )  NOT NULL AUTO_INCREMENT,

    month         VARCHAR( 16 )  NOT NULL,

    year_id       BIGINT( 20 ) NOT NULL,

    accounting_system_id        BIGINT( 20 ) NOT NULL,

    distribution_way_id         BIGINT( 20 ) NOT NULL,

    income_expense_clause_id    BIGINT( 20 ) NOT NULL,

    name          VARCHAR( 100 ) NOT NULL,

    suma           DOUBLE NOT NULL,

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
);







