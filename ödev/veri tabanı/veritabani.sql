SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

CREATE TABLE public."kullanici" (
    ad1 character varying NOT NULL,
	parola1 integer NOT NULL
);


ALTER TABLE public."kullanici" OWNER TO postgres;



INSERT INTO public."kullanici" VALUES
	('osmanpampal28',1234),
	('ibrahimpmpl28',4321);




ALTER TABLE ONLY public."kullanici"
    ADD CONSTRAINT "kullanici_pkey" PRIMARY KEY (ad1);


