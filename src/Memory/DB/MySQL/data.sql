/**
* @copyright (c) 2014, by Valentine
*
* @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
*/

/**
* Insert data into table year
*/

 INSERT INTO year
 VALUES   (null, 2010),
          (null, 2011),
          (null, 2012),
          (null, 2013),
          (null, 2014),
          (null, 2015),
          (null, 2016);


/**
* Insert data into table accounting_system
*/

INSERT INTO accounting_system
VALUES   (null, 'Д+ФОП'),
          (null, 'Д+ПП'),
          (null, 'Д+ТОВ'),
          (null, 'Д+ІНШЕ');

INSERT INTO income_expense_clause
VALUES    (null, 'ЗП'),
          (null, 'ОЗ'),
          (null, 'ОР'),
          (null, 'ПОД'),
          (null, 'КП'),
          (null, 'інше'),
          (null, 'ВД+Бонус'),
          (null, 'ВД+депозит'),
          (null, 'ВД+інше1'),
          (null, 'ВД+інше2');

INSERT INTO distribution_way (name)
VALUES ('%Ввсі'),
       ('%Вфоп'),
       ('%Впп'),
       ('%Втов'),
       ('серарвсі'),
       ('серарфоп'),
       ('серарпп'),
       ('серартов'),
       ('Д'),
       ('В'),
       ('Ш'),
       ('Ч'),
       ('Г'),
       ('Х67'),
       ('Х54'),
       ('Д63'),
       ('М89'),
       ('СС24'),
       ('КД11'),
       ('Сим');

INSERT INTO pharmacy ( shortname, name, legal_form, region, calculation_consider)
VALUES ('Д','Дністровська1','ФОП','Ів.-фр. обл.', 1),
       ('В','Дністровська2','ФОП','Ів.-фр. обл.', 1),
       ('Ш','Дністровська3','ФОП','Ів.-фр. обл.', 1),
       ('Ч','Дністровська4','ФОП','Ів.-фр. обл.', 1),
       ('Г','Дністровська5','ФОП','Ів.-фр. обл.', 1),
       ('Х67','Дністровська6','ФОП','Ів.-фр. обл.', 1),
       ('Х54','Дністровська7','ФОП','Ів.-фр. обл.', 1),
       ('Д63','Дністровська8','ПП','Ів.-фр. обл.', 1),
       ('М89','Дністровська9','ПП','Ів.-фр. обл.', 1),
       ('СС24','Дністровська10','ПП','Ів.-фр. обл.', 1),
       ('КД11','Дністровська11','ПП','Ів.-фр. обл.', 1);

INSERT INTO expense( month, year_id, 
                     accounting_system_id, 
                     income, 
                     income_expense_clause_id,
                     distribution_way_id,
                     name,
                     sum)
VALUES ('лютий', 5 , 2, 0, 1, 5, 'ЗП за лютий', 16640.09),
       ('березень', 5 , 2, 0, 1, 5, 'ЗП за березень', 17269.80),
       ('квітень', 5 , 2, 0, 1, 5, 'ЗП за квітень', 17443.61),
       ('травень', 5 , 2, 0, 1, 5, 'ЗП за травень', 19540.09);
       
       

