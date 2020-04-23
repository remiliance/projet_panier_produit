INSERT INTO product VALUES(1, 'Twilight' , 350, 120,0);
INSERT INTO product VALUES(2, 'Matrix' , 500, 200,0);
INSERT INTO product VALUES(3, 'Rambo' , 750, 400,0);

INSERT INTO Sexe_ref VALUES (1, 'FEMME');
INSERT INTO Sexe_ref VALUES (2, 'HOMME');

INSERT INTO Client VALUES(1, 'Robert',1);
INSERT INTO Client VALUES(2, 'Micheline',2);

INSERT INTO Account VALUES(1, 1234,1);
INSERT INTO Account VALUES(2, 5678,2);

INSERT INTO Panier VALUES(10, 1);
INSERT INTO Panier VALUES(11, 2);

INSERT INTO Panier_Line VALUES(1, '01/01', 1,'Twilight',10);
INSERT INTO Panier_Line VALUES(2, '01/02', 2,'Matrix',10);
INSERT INTO Panier_Line VALUES(3, 'Date', 3,'Rambo',10);
INSERT INTO Panier_Line VALUES(4, '01/02', 1,'Twilight',11);
INSERT INTO Panier_Line VALUES(5, '01/02', 2,'Matrix',11);
INSERT INTO Panier_Line VALUES(6, 'Date', 3,'Rambo',11);