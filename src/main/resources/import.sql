-- amenidades
INSERT INTO `amenidad` VALUES (1,'Terraza'),(2,'Cuarto de servicio'),(3,'Telefonia'),(4,'Fibra óptica'),(5,'Seguridad'),(6,'Balcón'),(7,'Living'),(8,'Calefacción'),(9,'Aire acondicionado'),(10,'Ascensor'),(11,'Cisterna'),(12,'Jacuzzi'),(13,'Roof garden'),(14,'Agua corriente'),(15,'Luz electrica'),(16,'Sistema contra incendios'),(17,'Vestidor'),(18,'Gas natural'),(19,'Gimnasio');

-- antiguedad
INSERT INTO `antiguedad` VALUES (1,'1 año'),(2,'2 años'),(3,'3 años');

-- authorities
INSERT INTO `authorities` VALUES (1,'ADMIN_ROLE'),(3,'CLIENT_ROLE'),(2,'EMPLOYEE_ROLE');

-- colonia
INSERT INTO `colonia` VALUES (1,1,'Polanco'),(2,1,'Granada'),(3,1,'Irrigación'),(4,1,'San Miguel Chapultepec'),(5,1,'Anzures'),(6,2,'Condesa'),(7,2,'Juárez'),(8,2,'Roma');

-- divisa
INSERT INTO `divisa` VALUES (1,'MXN'),(2,'USD');

-- empresa
INSERT INTO `empresa` VALUES (1,'Propia'),(2,'Inmuebles24'),(3,'MetrosCúbicos'),(4,'Propiedades.com');

-- estado
INSERT INTO `estado` VALUES (1,'Distrito Federal');

-- fotografia
INSERT INTO `fotografia` VALUES (1,1,'https://img10.naventcdn.com/avisos/18/00/53/52/02/02/1200x1200/106335307.jpg'),(2,1,'https://img10.naventcdn.com/avisos/18/00/53/52/02/02/1200x1200/106335308.jpg'),(3,1,'https://img10.naventcdn.com/avisos/18/00/53/52/02/02/1200x1200/106335309.jpg');

-- fuente
INSERT INTO `fuente` VALUES (1,2,0,53520202,'https://www.inmuebles24.com/propiedades/departamento-en-venta-en-polanco-53520202.html');

-- horario
INSERT INTO `horario` VALUES (1,'Abierto');

-- municipio
INSERT INTO `municipio` VALUES (1,1,'Miguel Hidalgo'),(2,1,'Cuauhtémoc');

-- propiedad
INSERT INTO `propiedad` VALUES (1,1,1,1,1,1,1,NULL,1,1,'\nDepartamento en Venta en Polanco',2,2,2,200,178,16500000,NULL,'Ubicado en la calle de Aristoteles, entre ejercito nacional y homero, esta en un tercer piso.El edificio cuenta puertas de seguridad.\nEspectacular departamento, nuevo, se entrega en obra blanca, Estancia abierta, terraza muy amplia, vista arbolada calle muy amplia. La estancia cuenta con muebles empotrados, cocina abierta con alacena de excelente tamaño y distribución, baño de visitas, recibidor, recámaras que tienen mucha luz, ambas con vestidor y baño, área de lavado, Dos estacionamientos, amplios y cómodos.\nEl edificio cuenta con Gimnasio y terraza, estética, cuarto de masajes, Roof Garden de excelente tamaño para eventos, tiene jacuzzi, parrilla. vigilancia las 24 horas. EasyBroker ID: EB-BE6390','2018-10-14 00:00:00');

-- propiedades_amenidades
INSERT INTO `propiedades_amenidades` VALUES (3,1,10),(2,1,11),(1,1,19);

-- status
INSERT INTO `status` VALUES (1,'Temporal'),(2,'Disponible'),(3,'Baja por sistema'),(4,'Baja por usuario');

-- tipo operacion
INSERT INTO `tipo_operacion` VALUES (1,'Venta'),(2,'Renta');

-- ubicacion
INSERT INTO `ubicacion` VALUES (1,1,'Aristoteles # 620','66547');

-- usuario
INSERT INTO `usuario` VALUES (1,'admin','admin@sinvueltas.mx','123456','2018-10-14 00:00:00'),(2,'jose','jose@sinvueltas.mx','654321','2018-10-12 00:00:00');

-- usuario_authorities
INSERT INTO `usuarios_authorities` VALUES (1,1),(2,2);

-- verificacion
INSERT INTO `verificacion` VALUES (1,1,'Validado');


