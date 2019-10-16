INSERT INTO TBD_USUARIO ( APELIDO , NOME, CELULAR , EMAIL ,SENHA ) VALUES ('Bru','Bruno',12345678911,'bruno@email.com','123456');
INSERT INTO TBD_USUARIO ( APELIDO , NOME, CELULAR , EMAIL ,SENHA ) VALUES ('admin','admin',12345678911,'admin@email.com','123456');

INSERT INTO TBD_CATEGORIA (NOME_CATEGORIA) values ('Esportes');
INSERT INTO TBD_CATEGORIA (NOME_CATEGORIA) values ('Festas');
INSERT INTO TBD_CATEGORIA (NOME_CATEGORIA) values ('Jogos');

INSERT INTO TBD_ENDERECO (BAIRRO, CEP, CIDADE, ESTADO, NUMERO, RUA) VALUES ('Jd. bela vista', '000123','São Paulo', 'SP', '444', 'Av. paulista');

INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 15:00','2019-10-15 15:00','Fut de sabadao',1,0,'FUTEBAS',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 22:00','2019-10-15 00:00','Festinha nada social',1,0,'Baladinha black',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 15:00','2019-10-15 15:00','Fut de sabadao',1,0,'FUTEBAS',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 22:00','2019-10-15 00:00','Festinha nada social',1,0,'Baladinha black',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 15:00','2019-10-15 15:00','Fut de sabadao',1,0,'FUTEBAS',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 22:00','2019-10-15 00:00','Festinha nada social',1,0,'Baladinha black',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 15:00','2019-10-15 15:00','Fut de sabadao',1,0,'FUTEBAS',1);
INSERT INTO TBD_EVENTO ( DATA_HORA_INICIO , DATA_HORA_FIM , DESCRICAO , ID_ENDERECO , IS_PRIVADO , NOME_EVENTO , CATEGORIA_ID_CATEGORIA ) VALUES ('2019-10-15 15:00','2019-10-15 15:00','Fut de sabadao',1,0,'FUTEBAS',1);

INSERT INTO TBD_USUARIO_EVENTO(USUARIO_ID,EVENTO_ID,IS_ORGANIZADOR) VALUES(1,1,true);
INSERT INTO TBD_USUARIO_EVENTO(USUARIO_ID,EVENTO_ID,IS_ORGANIZADOR) VALUES(1,2,false);

INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Futebol',1);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Volei',1);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Tenis',1);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Basquete',1);

INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Bloquinho',2);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Festival',2);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Balada',2);

INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('RPG',3);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Tabuleiro',3);
INSERT INTO TBD_SUB_CATEGORIA ( NOME_SUB_CATEGORIA , ID_CATEGORIA ) values ('Games',3);