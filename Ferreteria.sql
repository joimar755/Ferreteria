-- DROP SCHEMA dbo1;

CREATE SCHEMA dbo;
-- Facturacion.dbo.Departamentos definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Departamentos;

CREATE TABLE Departamentos (
	Departamentos_id int IDENTITY(1,1) NOT NULL,
	Nombre_Depa varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Departam__F78DB810DFFD9482 PRIMARY KEY (Departamentos_id)
);


-- Facturacion.dbo.Persona definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Persona;

CREATE TABLE Persona (
	Persona_id int IDENTITY(1,1) NOT NULL,
	FirstName varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	LastName varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	Number_doc int NOT NULL,
	Fecha_Nac date NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Persona__2C9371E8DC4290F4 PRIMARY KEY (Persona_id)
);


-- Facturacion.dbo.TypeUser definition

-- Drop table

-- DROP TABLE Facturacion.dbo.TypeUser;

CREATE TABLE TypeUser (
	TypeUserId int IDENTITY(1,1) NOT NULL,
	Description varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	Active bit DEFAULT 1 NOT NULL,
	CONSTRAINT PK__TypeUser__49E1F53DCF0110DA PRIMARY KEY (TypeUserId)
);


-- Facturacion.dbo.Cliente definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Cliente;

CREATE TABLE Cliente (
	Cliente_id int IDENTITY(1,1) NOT NULL,
	PhoneNumber int NULL,
	Email varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Addres varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Persona_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Cliente__EB6B387CFCDA2CED PRIMARY KEY (Cliente_id),
	CONSTRAINT FK__Cliente__Persona__5812160E FOREIGN KEY (Persona_id) REFERENCES Persona(Persona_id)
);


-- Facturacion.dbo.Cotizaciones definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Cotizaciones;

CREATE TABLE Cotizaciones (
	Cotizaciones_id int IDENTITY(1,1) NOT NULL,
	Fecha date NOT NULL,
	Cliente_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Cotizaci__BFFDEDDC09C01AD6 PRIMARY KEY (Cotizaciones_id),
	CONSTRAINT FK__Cotizacio__Clien__778AC167 FOREIGN KEY (Cliente_id) REFERENCES Cliente(Cliente_id)
);


-- Facturacion.dbo.Facturas definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Facturas;

CREATE TABLE Facturas (
	Facturas_id int IDENTITY(1,1) NOT NULL,
	Fecha date NOT NULL,
	Cliente_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Facturas__554FC4C12DDCCC4E PRIMARY KEY (Facturas_id),
	CONSTRAINT FK__Facturas__Client__01142BA1 FOREIGN KEY (Cliente_id) REFERENCES Cliente(Cliente_id)
);


-- Facturacion.dbo.Municipios definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Municipios;

CREATE TABLE Municipios (
	Municipios_id int IDENTITY(1,1) NOT NULL,
	Nombre_Muni varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Departamentos_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Municipi__474C25B9EA849043 PRIMARY KEY (Municipios_id),
	CONSTRAINT FK__Municipio__Depar__60A75C0F FOREIGN KEY (Departamentos_id) REFERENCES Departamentos(Departamentos_id)
);


-- Facturacion.dbo.Users definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Users;

CREATE TABLE Users (
	UsersId int IDENTITY(1,1) NOT NULL,
	FirstName varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	LastName varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	Type_doc varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	Number_doc int NULL,
	Email varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	TypeUserId int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	Active bit DEFAULT 1 NOT NULL,
	Pass varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT PK__Users__A349B0627A15DE36 PRIMARY KEY (UsersId),
	CONSTRAINT FK__Users__TypeUserI__4F7CD00D FOREIGN KEY (TypeUserId) REFERENCES TypeUser(TypeUserId)
);


-- Facturacion.dbo.Direccion definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Direccion;

CREATE TABLE Direccion (
	Direccion_id int IDENTITY(1,1) NOT NULL,
	Direccion varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Municipios_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Direccio__D96E74B3A4DA406D PRIMARY KEY (Direccion_id),
	CONSTRAINT FK__Direccion__Munic__656C112C FOREIGN KEY (Municipios_id) REFERENCES Municipios(Municipios_id)
);


-- Facturacion.dbo.Providers definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Providers;

CREATE TABLE Providers (
	Providers_id int IDENTITY(1,1) NOT NULL,
	Nit varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Razon_Social varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Departamentos_id int NOT NULL,
	Municipios_id int NOT NULL,
	Direccion_id int NOT NULL,
	Persona_id int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Provider__44960CB5239B6244 PRIMARY KEY (Providers_id),
	CONSTRAINT FK__Providers__Depar__6B24EA82 FOREIGN KEY (Departamentos_id) REFERENCES Departamentos(Departamentos_id),
	CONSTRAINT FK__Providers__Direc__6D0D32F4 FOREIGN KEY (Direccion_id) REFERENCES Direccion(Direccion_id),
	CONSTRAINT FK__Providers__Munic__6C190EBB FOREIGN KEY (Municipios_id) REFERENCES Municipios(Municipios_id),
	CONSTRAINT FK__Providers__Perso__6A30C649 FOREIGN KEY (Persona_id) REFERENCES Persona(Persona_id)
);


-- Facturacion.dbo.Productos definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Productos;

CREATE TABLE Productos (
	Productos_id int IDENTITY(1,1) NOT NULL,
	FirstName varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	Price_Unit int NOT NULL,
	Stock int NOT NULL,
	Providers_id int NOT NULL,
	UsersId int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Producto__602F438B75BBEDAC PRIMARY KEY (Productos_id),
	CONSTRAINT FK__Productos__Provi__71D1E811 FOREIGN KEY (Providers_id) REFERENCES Providers(Providers_id),
	CONSTRAINT FK__Productos__Users__72C60C4A FOREIGN KEY (UsersId) REFERENCES Users(UsersId)
);


-- Facturacion.dbo.Detalle_Cotizacion definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Detalle_Cotizacion;

CREATE TABLE Detalle_Cotizacion (
	Detalle_Cotizacion_id int IDENTITY(1,1) NOT NULL,
	Cotizaciones_id int NOT NULL,
	Productos_id int NOT NULL,
	Cantidad int NOT NULL,
	Price_Unit int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Detalle___3F6CCF5F57C5ED51 PRIMARY KEY (Detalle_Cotizacion_id),
	CONSTRAINT FK__Detalle_C__Produ__7C4F7684 FOREIGN KEY (Productos_id) REFERENCES Productos(Productos_id)
);


-- Facturacion.dbo.Detalle_Factura definition

-- Drop table

-- DROP TABLE Facturacion.dbo.Detalle_Factura;

CREATE TABLE Detalle_Factura (
	Detalle_Factura_id int IDENTITY(1,1) NOT NULL,
	Facturas_id int NOT NULL,
	Productos_id int NOT NULL,
	Cantidad int NOT NULL,
	Price_Unit int NOT NULL,
	Subtotal int NOT NULL,
	AddedOn date DEFAULT getdate() NOT NULL,
	Modified date DEFAULT getdate() NOT NULL,
	CONSTRAINT PK__Detalle___510B60192533FDEE PRIMARY KEY (Detalle_Factura_id),
	CONSTRAINT FK__Detalle_F__Factu__06CD04F7 FOREIGN KEY (Facturas_id) REFERENCES Facturas(Facturas_id),
	CONSTRAINT FK__Detalle_F__Produ__05D8E0BE FOREIGN KEY (Productos_id) REFERENCES Productos(Productos_id)
);
