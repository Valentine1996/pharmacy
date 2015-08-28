/**
* @copyright (c) 2014, by Valentine
*
* @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
*/
INSERT INTO user VALUES 
(1, "Valentyn", "Namisnyk", "valentine", "Valentyn_Prodyser@ukr.net", "$2a$10$RLmDHa6gRtT18NZ1vuuLLeideyES/wiFxF18X0TEXeDPNlx87FoLO", 1),
(2, "Vitaliy", "Zuzman", "coffeine", "hui@ukr.net", "$2a$10$JYFjbS800kQ2iVz2hbOc6.wAV650q5mHoD9thQr48K6TsHLMa.Lty", 1);

INSERT INTO role VALUES
(1, "ROLE_USER"),
(2, "ROLE");
INSERT INTO user_roles VALUES
  (1, 1),
  (2, 2);

INSERT INTO year
VALUES    (1, 2010),
          (2, 2011),
          (3, 2012),
          (4, 2013),
          (5, 2014),
          (6, 2015),
          (7, 2016);


INSERT INTO accounting_system
VALUES    (1, 'Д+ФОП'),
          (2, 'Д+ПП'),
          (3, 'Д+ТОВ'),
          (4, 'Д+ІНШЕ');

INSERT INTO income_expense_clause
VALUES    (1, 'ЗП'),
          (2, 'ОЗ'),
          (3, 'ОР'),
          (4, 'ПОД'),
          (5, 'КП'),
          (6, 'інше'),
          (7, 'ВД+Бонус'),
          (8, 'ВД+депозит'),
          (9, 'ВД+інше1'),
          (10, 'ВД+інше2');

INSERT INTO distribution_way
VALUES (1, '%Ввсі'),
       (2, '%Вфоп'),
       (3, '%Впп'),
       (4, '%Втов'),
       (5, 'серарвсі'),
       (6, 'серарфоп'),
       (7, 'серарпп'),
       (8, 'серартов'),
       (9, 'Д'),
       (10, 'В'),
       (11, 'Ш'),
       (12, 'Ч'),
       (13, 'Г'),
       (14, 'Х67'),
       (15, 'Х54'),
       (16, 'Д63'),
       (17, 'М89'),
       (18, 'СС24'),
       (19, 'КД11'),
       (20, 'Сим');

INSERT INTO pharmacy(id, shortName, name, legal_form, region, calculation_consider)
VALUES  (1, 'Д','Дністровська1','ФОП','Ів.-фр. обл.', 1),
        (2, 'В','Дністровська2','ФОП','Ів.-фр. обл.', 1),
        (3, 'Ш','Дністровська3','ФОП','Ів.-фр. обл.', 1),
        (4, 'Ч','Дністровська4','ФОП','Ів.-фр. обл.', 1),
        (5, 'Г','Дністровська5','ФОП','Ів.-фр. обл.', 1),
        (6, 'Х67','Дністровська6','ФОП','Ів.-фр. обл.', 1),
        (7, 'Х54','Дністровська7','ФОП','Ів.-фр. обл.', 1),
        (8, 'Д63','Дністровська8','ПП','Ів.-фр. обл.', 1),
        (9, 'М89','Дністровська9','ПП','Ів.-фр. обл.', 1),
        (10, 'СС24','Дністровська10','ПП','Ів.-фр. обл.', 1),
        (11, 'КД11','Дністровська11','ПП','Ів.-фр. обл.', 1);

INSERT INTO expense (id, month, year_id, accounting_system_id, income, distribution_way_id, income_expense_clause_id, name, suma)
VALUES (1, 'лютий', 5 , 2, 0, 1, 5, 'ЗП за лютий', 16640.09),
       (2, 'березень', 5 , 2, 0, 1, 5, 'ЗП за березень', 17269.80),
       (3, 'квітень', 5 , 2, 0, 1, 5, 'ЗП за квітень', 17443.61),
       (4, 'травень', 5 , 2, 0, 1, 5, 'ЗП за травень', 19540.09);
  
INSERT INTO profit ( id,month , year_id, pharmacy_id, profit, PH, GI, GI_BONUS, GI_DEPOSIT, GI_ANOTHER1, GI_ANOTHER2, GI_TOTAL)
VALUES  (1, 'січень', 5, 1, 279382.22, 15.37, 42943.51, 0, 0, 0, 0, 42943.51),
        (2, 'січень', 5, 2, 58814.49, 15.72, 9243.09, 0, 0, 0, 0, 9243.09),
        (3, 'січень', 5, 3, 0.00, 0.00, 0.00, 0, 0, 0, 0, 0.00),
        (4, 'січень', 5, 4, 148567.45, 12.12, 18001.12, 0, 0, 0, 0, 18001.12);
