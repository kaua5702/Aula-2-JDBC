# 📚 Java JDBC - Listagem de Estudantes

> ⚠️ **Aviso:** Este código foi copiado como conteúdo de uma **aula introdutória** sobre conexão com banco de dados em Java. Ele não representa boas práticas de produção e tem fins exclusivamente educacionais.

---

## 📄 Descrição

Exemplo básico de conexão com um banco de dados MySQL utilizando **JDBC (Java Database Connectivity)**. O código realiza uma consulta em uma tabela de estudantes e exibe **todos os registros** encontrados, incluindo id, nome, idade e curso.

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **JDBC** (Java Database Connectivity)
- **MySQL**

---

## ⚙️ Pré-requisitos

- JDK instalado
- MySQL rodando localmente na porta `3306`
- Banco de dados `escola` criado com uma tabela `estudante` contendo as colunas `id`, `nome`, `idade` e `curso`
- Driver JDBC do MySQL (`com.mysql.jdbc.Driver`) no classpath

---

## 🗄️ Configuração do Banco de Dados

```sql
CREATE DATABASE escola;

USE escola;

CREATE TABLE estudante (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    curso VARCHAR(100) NOT NULL
);

INSERT INTO estudante (nome, idade, curso) VALUES
('Maria', 20, 'Engenharia'),
('João', 22, 'Ciência da Computação'),
('Ana', 19, 'Matemática');
```

---

## ▶️ Como Executar

1. Clone o repositório
2. Adicione o `.jar` do conector MySQL ao seu classpath
3. Ajuste as credenciais no código (`uname` e `pass`) se necessário
4. Compile e execute:

```bash
javac Main.java
java -cp .:mysql-connector-java.jar Main
```

---

## 📋 O que o código faz

1. Estabelece uma conexão com o banco de dados MySQL
2. Executa a query `SELECT * FROM estudante`
3. Itera sobre **todos os registros** retornados com um `while`
4. Imprime id, nome, idade e curso de cada estudante no console

### Exemplo de saída

```
1 | Maria | 20 | Engenharia
2 | João | 22 | Ciência da Computação
3 | Ana | 19 | Matemática
```

---
