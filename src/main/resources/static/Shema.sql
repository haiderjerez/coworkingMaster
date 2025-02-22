-- Creacion de base de datos
CREATE DATABASE coworking;

-- Activacion de base de datos
\c coworking;

--Inserts Disponibilidad
INSERT INTO Disponibilidad (1,'Disponible');
INSERT INTO Disponibilidad (2,'No Disponible');

--Inserts TipoEspacio
INSERT INTO TipoEspacio (1,'Oficina');
INSERT INTO TipoEspacio (2,'Salon');
INSERT INTO TipoEspacio (3,'Estudio');


--Inserts EstadoReserva
INSERT INTO EstadoReserva (1,'Pendiente');
INSERT INTO EstadoReserva (2,'Confirmada');
INSERT INTO EstadoReserva (3,'Cancelada');


--Inserciones Espacios

INSERT INTO Espacios(1,"Salon1",1,"5 personas",1);
INSERT INTO Espacios(2,"Salon2",2,"30 personas",2);
INSERT INTO Espacios(3,"Salon3",3,"15 personas",1);
INSERT INTO Espacios(4,"Salon4",1,"5 personas",2);
INSERT INTO Espacios(5,"Salon5",2,"30 personas",1);
INSERT INTO Espacios(6,"Salon6",3,"15 personas",2);
INSERT INTO Espacios(7,"Salon7",1,"5 personas",1);
INSERT INTO Espacios(8,"Salon8",2,"30 personas",2);
INSERT INTO Espacios(9,"Salon9",3,"15 personas",1);
INSERT INTO Espacios(10,"Salon10",1,"5 personas",2);

--Inserciones Reservas
INSERT INTO Reservas(1,1,'2022-01-01','6 AM','7 AM',1);
INSERT INTO Reservas(2,2,'2022-02-02','7 AM','8 AM',2);
INSERT INTO Reservas(3,3,'2022-03-03','8 AM','9 AM',3);
INSERT INTO Reservas(4,4,'2022-04-04','9 AM','10 AM',1);
INSERT INTO Reservas(5,5,'2022-05-05','10 AM','11 AM',2);
INSERT INTO Reservas(6,6,'2022-06-06','11 AM','12 AM',3);
INSERT INTO Reservas(7,7,'2022-07-07','12 PM','1 PM',1);
INSERT INTO Reservas(8,8,'2022-08-08','1 PM','2 PM',2);
INSERT INTO Reservas(9,9,'2022-09-09','2 PM','3 PM',3);
INSERT INTO Reservas(10,10,'2022-10-10','3 PM','4 PM',1);