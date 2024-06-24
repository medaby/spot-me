DROP TABLE IF EXISTS t_spots;

CREATE TABLE t_spot(
   id 			INT GENERATED ALWAYS AS IDENTITY NOT NULL,	--SMALLSERIAL/BIGSERIAL
   spot_name	VARCHAR(200) NOT NULL,
   spot_lat		DECIMAL(9,6) NOT NULL,
   spot_lng		DECIMAL(9,6) NOT NULL,
   spot_desc	VARCHAR(2000),
   spot_img		VARCHAR(60),
   CONSTRAINT t_spot_UK UNIQUE (spot_name, spot_lat, spot_lng),
   CONSTRAINT t_spot_PK PRIMARY KEY (id)
);

-- SERIAL / SMALLSERIAL / BIGSERIAL
-- GENERATED ALWAYS AS IDENTITY
-- IDENTITY c'est la base qui gère la valeur, pas java
-- motivation / pourquoi je le fais qu'est ce que ça apport
-- script de mise en place des bases de données