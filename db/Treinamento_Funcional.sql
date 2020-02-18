-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.2-alpha1
-- PostgreSQL version: 11.0
-- Project Site: pgmodeler.io
-- Model Author: ---


-- Database creation must be done outside a multicommand file.
-- These commands were put in this file only as a convenience.
-- -- object: "Treinamento_Funcional" | type: DATABASE --
-- -- DROP DATABASE IF EXISTS "Treinamento_Funcional";
-- CREATE DATABASE "Treinamento_Funcional";
-- -- ddl-end --
-- 

-- object: public."Pessoa" | type: TABLE --
-- DROP TABLE IF EXISTS public."Pessoa" CASCADE;
CREATE TABLE public."Pessoa" (
	nome varchar(50) NOT NULL,
	"CPF" varchar(14) NOT NULL,
	email varchar(50),
	telefone varchar(20),
	CONSTRAINT "Pessoa_pk" PRIMARY KEY ("CPF")

);
-- ddl-end --
ALTER TABLE public."Pessoa" OWNER TO postgres;
-- ddl-end --

-- object: public."Aluno" | type: TABLE --
-- DROP TABLE IF EXISTS public."Aluno" CASCADE;
CREATE TABLE public."Aluno" (
	dia_pagamento smallint,
	sexo char(1),
	dt_nascimento date,
	imagem bytea,
	ficha_alimentacao text,
	restricao text,
	"CPF_Nutricionista" varchar(14),

-- 	nome varchar(50) NOT NULL,
-- 	"CPF" varchar(14) NOT NULL,
-- 	email varchar(50),
-- 	telefone varchar(20),
	CONSTRAINT "Aluno_pk" PRIMARY KEY ("CPF")

) INHERITS(public."Pessoa");
-- ddl-end --
ALTER TABLE public."Aluno" OWNER TO postgres;
-- ddl-end --

-- object: public."Equipamento" | type: TABLE --
-- DROP TABLE IF EXISTS public."Equipamento" CASCADE;
CREATE TABLE public."Equipamento" (
	id serial NOT NULL,
	nome varchar(20) NOT NULL,
	status varchar(20),
	p_manutencao date,
	u_manutencao date,
	CONSTRAINT "Equipamento_pk" PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE public."Equipamento" OWNER TO postgres;
-- ddl-end --

-- object: public."Funcionario" | type: TABLE --
-- DROP TABLE IF EXISTS public."Funcionario" CASCADE;
CREATE TABLE public."Funcionario" (
	salario decimal(12,2),
	especialidade varchar(30),
	senha text NOT NULL,

-- 	nome varchar(50) NOT NULL,
-- 	"CPF" varchar(14) NOT NULL,
-- 	email varchar(50),
-- 	telefone varchar(20),
	CONSTRAINT "Funcionario_pk" PRIMARY KEY ("CPF")

) INHERITS(public."Pessoa");
-- ddl-end --
ALTER TABLE public."Funcionario" OWNER TO postgres;
-- ddl-end --

-- object: public."Pagamento" | type: TABLE --
-- DROP TABLE IF EXISTS public."Pagamento" CASCADE;
CREATE TABLE public."Pagamento" (
	valor decimal(12,2) NOT NULL,
	data date NOT NULL,
	"CPF_Aluno" varchar(14) NOT NULL,
	multa boolean,
	CONSTRAINT "Pagamento_pk" PRIMARY KEY (data,"CPF_Aluno")

);
-- ddl-end --
ALTER TABLE public."Pagamento" OWNER TO postgres;
-- ddl-end --

-- object: "Aluno_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Pagamento" DROP CONSTRAINT IF EXISTS "Aluno_fk" CASCADE;
ALTER TABLE public."Pagamento" ADD CONSTRAINT "Aluno_fk" FOREIGN KEY ("CPF_Aluno")
REFERENCES public."Aluno" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Turma" | type: TABLE --
-- DROP TABLE IF EXISTS public."Turma" CASCADE;
CREATE TABLE public."Turma" (

);
-- ddl-end --

-- object: id | type: COLUMN --
-- ALTER TABLE public."Turma" DROP COLUMN IF EXISTS id CASCADE;
ALTER TABLE public."Turma" ADD COLUMN id serial NOT NULL;
-- ddl-end --


-- object: quantidade | type: COLUMN --
-- ALTER TABLE public."Turma" DROP COLUMN IF EXISTS quantidade CASCADE;
ALTER TABLE public."Turma" ADD COLUMN quantidade smallint;
-- ddl-end --


-- object: horarios | type: COLUMN --
-- ALTER TABLE public."Turma" DROP COLUMN IF EXISTS horarios CASCADE;
ALTER TABLE public."Turma" ADD COLUMN horarios varchar(100);
-- ddl-end --


-- object: "CPF_Instrutor" | type: COLUMN --
-- ALTER TABLE public."Turma" DROP COLUMN IF EXISTS "CPF_Instrutor" CASCADE;
ALTER TABLE public."Turma" ADD COLUMN "CPF_Instrutor" varchar(14) NOT NULL;
-- ddl-end --

-- object: "Turma_pk" | type: CONSTRAINT --
-- ALTER TABLE public."Turma" DROP CONSTRAINT IF EXISTS "Turma_pk" CASCADE;
ALTER TABLE public."Turma" ADD CONSTRAINT "Turma_pk" PRIMARY KEY (id);
-- ddl-end --

ALTER TABLE public."Turma" OWNER TO postgres;
-- ddl-end --

-- object: public."Turma_Aluno" | type: TABLE --
-- DROP TABLE IF EXISTS public."Turma_Aluno" CASCADE;
CREATE TABLE public."Turma_Aluno" (
	"id_Turma" integer NOT NULL,
	"CPF_Aluno" varchar(14) NOT NULL,
	CONSTRAINT "Turma_Aluno_pk" PRIMARY KEY ("id_Turma","CPF_Aluno")

);
-- ddl-end --

-- object: "Turma_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Turma_Aluno" DROP CONSTRAINT IF EXISTS "Turma_fk" CASCADE;
ALTER TABLE public."Turma_Aluno" ADD CONSTRAINT "Turma_fk" FOREIGN KEY ("id_Turma")
REFERENCES public."Turma" (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: "Aluno_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Turma_Aluno" DROP CONSTRAINT IF EXISTS "Aluno_fk" CASCADE;
ALTER TABLE public."Turma_Aluno" ADD CONSTRAINT "Aluno_fk" FOREIGN KEY ("CPF_Aluno")
REFERENCES public."Aluno" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Exercicio" | type: TABLE --
-- DROP TABLE IF EXISTS public."Exercicio" CASCADE;
CREATE TABLE public."Exercicio" (
	nome varchar(50) NOT NULL,
	"CPF_Aluno" varchar(14) NOT NULL,
	repeticao smallint,
	"id_Equipamento" integer,
	CONSTRAINT "Exercicio_pk" PRIMARY KEY (nome,"CPF_Aluno")

);
-- ddl-end --
ALTER TABLE public."Exercicio" OWNER TO postgres;
-- ddl-end --

-- object: "Equipamento_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Exercicio" DROP CONSTRAINT IF EXISTS "Equipamento_fk" CASCADE;
ALTER TABLE public."Exercicio" ADD CONSTRAINT "Equipamento_fk" FOREIGN KEY ("id_Equipamento")
REFERENCES public."Equipamento" (id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Aluno_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Exercicio" DROP CONSTRAINT IF EXISTS "Aluno_fk" CASCADE;
ALTER TABLE public."Exercicio" ADD CONSTRAINT "Aluno_fk" FOREIGN KEY ("CPF_Aluno")
REFERENCES public."Aluno" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Administrativo" | type: TABLE --
-- DROP TABLE IF EXISTS public."Administrativo" CASCADE;
CREATE TABLE public."Administrativo" (

-- 	salario decimal(12,2),
-- 	especialidade varchar(30),
-- 	senha text NOT NULL,
-- 	nome varchar(50) NOT NULL,
-- 	"CPF" varchar(14) NOT NULL,
-- 	email varchar(50),
-- 	telefone varchar(20),
	CONSTRAINT "Administrativo_pk" PRIMARY KEY ("CPF")

) INHERITS(public."Funcionario");
-- ddl-end --
ALTER TABLE public."Administrativo" OWNER TO postgres;
-- ddl-end --

-- object: public."Nutricionista" | type: TABLE --
-- DROP TABLE IF EXISTS public."Nutricionista" CASCADE;
CREATE TABLE public."Nutricionista" (

-- 	salario decimal(12,2),
-- 	especialidade varchar(30),
-- 	senha text NOT NULL,
-- 	nome varchar(50) NOT NULL,
-- 	"CPF" varchar(14) NOT NULL,
-- 	email varchar(50),
-- 	telefone varchar(20),
	CONSTRAINT "Nutricionista_pk" PRIMARY KEY ("CPF")

) INHERITS(public."Funcionario");
-- ddl-end --
ALTER TABLE public."Nutricionista" OWNER TO postgres;
-- ddl-end --

-- object: public."Instrutor" | type: TABLE --
-- DROP TABLE IF EXISTS public."Instrutor" CASCADE;
CREATE TABLE public."Instrutor" (

-- 	salario decimal(12,2),
-- 	especialidade varchar(30),
-- 	senha text NOT NULL,
-- 	nome varchar(50) NOT NULL,
-- 	"CPF" varchar(14) NOT NULL,
-- 	email varchar(50),
-- 	telefone varchar(20),
	CONSTRAINT "Instrutor_pk" PRIMARY KEY ("CPF")

) INHERITS(public."Funcionario");
-- ddl-end --
ALTER TABLE public."Instrutor" OWNER TO postgres;
-- ddl-end --

-- object: "Instrutor_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Turma" DROP CONSTRAINT IF EXISTS "Instrutor_fk" CASCADE;
ALTER TABLE public."Turma" ADD CONSTRAINT "Instrutor_fk" FOREIGN KEY ("CPF_Instrutor")
REFERENCES public."Instrutor" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: "Nutricionista_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Aluno" DROP CONSTRAINT IF EXISTS "Nutricionista_fk" CASCADE;
ALTER TABLE public."Aluno" ADD CONSTRAINT "Nutricionista_fk" FOREIGN KEY ("CPF_Nutricionista")
REFERENCES public."Nutricionista" ("CPF") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Agendamento" | type: TABLE --
-- DROP TABLE IF EXISTS public."Agendamento" CASCADE;
CREATE TABLE public."Agendamento" (
	"CPF_Aluno" varchar(14) NOT NULL,
	descricao text NOT NULL,
	data_hora timestamp NOT NULL,
	CONSTRAINT "Agendamento_pk" PRIMARY KEY (data_hora,"CPF_Aluno")

);
-- ddl-end --
ALTER TABLE public."Agendamento" OWNER TO postgres;
-- ddl-end --

-- object: "Aluno_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Agendamento" DROP CONSTRAINT IF EXISTS "Aluno_fk" CASCADE;
ALTER TABLE public."Agendamento" ADD CONSTRAINT "Aluno_fk" FOREIGN KEY ("CPF_Aluno")
REFERENCES public."Aluno" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Gastos" | type: TABLE --
-- DROP TABLE IF EXISTS public."Gastos" CASCADE;
CREATE TABLE public."Gastos" (
	id serial NOT NULL,
	valor decimal(12,2) NOT NULL,
	data date NOT NULL,
	descricao text,
	"CPF_Funcionario" varchar(14) NOT NULL,
	CONSTRAINT "Gastos_pk" PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE public."Gastos" OWNER TO postgres;
-- ddl-end --

-- object: "Funcionario_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Gastos" DROP CONSTRAINT IF EXISTS "Funcionario_fk" CASCADE;
ALTER TABLE public."Gastos" ADD CONSTRAINT "Funcionario_fk" FOREIGN KEY ("CPF_Funcionario")
REFERENCES public."Funcionario" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: public."Avaliacao" | type: TABLE --
-- DROP TABLE IF EXISTS public."Avaliacao" CASCADE;
CREATE TABLE public."Avaliacao" (
	altura decimal(5,2),
	peso decimal(5,2),
	porcentagem_gordura float,
	porcentagem_massa float,
	data date NOT NULL,
	"CPF_Aluno" varchar(14) NOT NULL,
	CONSTRAINT "Avaliacao_pk" PRIMARY KEY (data,"CPF_Aluno")

);
-- ddl-end --
ALTER TABLE public."Avaliacao" OWNER TO postgres;
-- ddl-end --

-- object: "Aluno_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Avaliacao" DROP CONSTRAINT IF EXISTS "Aluno_fk" CASCADE;
ALTER TABLE public."Avaliacao" ADD CONSTRAINT "Aluno_fk" FOREIGN KEY ("CPF_Aluno")
REFERENCES public."Aluno" ("CPF") MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --


