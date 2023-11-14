create database GerenciadorDeProjetos;
use GerenciadorDeProjetos;
create table tb_usuarios(
cod_usuario int auto_increment primary key,
nome_usuario varchar(45),
email_usuario varchar(50),
senha_usuario varchar(15),
telefone_usuario varchar(15));

create table tb_admin(
cod_admin int auto_increment primary key,
nome_admin varchar(45),
senha_admin varchar(15));
insert into tb_admin (nome_admin, senha_admin) values 
("admin", "admin");

create table tb_projetos(
cod_projeto int auto_increment primary key,
nome_projeto varchar(40),
descricao_projeto text,
tipoODS_projeto varchar(50),
responsavel_projeto varchar(45),
telefone_projeto varchar(15),
data_criacao varchar(10),
status_projeto varchar(15));