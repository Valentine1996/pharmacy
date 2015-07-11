/**
* @copyright (c) 2014, by Valentine
*
* @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
*/

/**
* Insert data into table year
*/

INSERT INTO year (name)
VALUES    (2010),
          (2011),
          (2012),
          (2013),
          (2014),
          (2015),
          (2016);


/**
* Insert data into table accounting_system
*/

INSERT INTO accounting_system
VALUES   (null, 'Д+ФОП'),
          (null, 'Д+ПП'),
          (null, 'Д+ТОВ'),
          (null, 'Д+ІНШЕ');

INSERT INTO income_expense_clause
VALUES   (null, 'ЗП'),
          (null, 'ОЗ'),
          (null, 'ОР'),
          (null, 'ПОД'),
          (null, 'КП'),
          (null, 'інше'),
          (null, 'ВД+Бонус'),
          (null, 'ВД+депозит'),
          (null, 'ВД+інше1'),
          (null, 'ВД+інше2');
