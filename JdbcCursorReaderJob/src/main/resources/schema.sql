CREATE TABLE cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    sobrenome VARCHAR(100), 
    idade VARCHAR(15),
    email VARCHAR(50),
    endereco INT,
    FOREIGN KEY (endereco) REFERENCES endereco(id)
);


CREATE TABLE endereco (
    id INT PRIMARY KEY AUTO_INCREMENT,
    rua VARCHAR(50) ,
    cidade VARCHAR(50) ,
    estado VARCHAR(2) ,
    cep VARCHAR(8) 
);
