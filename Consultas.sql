 
-- conulta del depa y muni
SELECT m.Municipios_id AS Id, d.Nombre_Depa,m.Nombre_Muni  
FROM Municipios m 
INNER JOIN Departamentos d  ON m.Departamentos_id = d.Departamentos_id; 
-- consulta direccion con su depa y muni 
SELECT d.Direccion_id AS ID, m.Nombre_Muni AS Municipios,de.Nombre_Depa AS Departamentos, d.Direccion, m.Municipios_id
FROM Direccion d 
INNER JOIN Municipios m ON d.Municipios_id = m.Municipios_id
INNER JOIN Departamentos de ON m.Departamentos_id = de.Departamentos_id; 


