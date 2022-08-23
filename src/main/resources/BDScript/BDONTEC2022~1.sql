/***********************************
                    CREANDO TABLAS
************************************/

CREATE TABLE TBL_USUARIO(
CODUSU NUMERIC(10) NOT NULL  PRIMARY KEY,
NOMUSU VARCHAR(60) NOT NULL UNIQUE,
CLAVEUSU VARCHAR(45) NOT NULL,
ESTADOUSU CHAR(11) NOT NULL
);
COMMIT;




/***********************************
                    CREAR SEQUENCIA
************************************/
CREATE SEQUENCE SEQ_USUARIO;