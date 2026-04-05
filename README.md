# Workshop Spring Boot com MongoDB

[![Java Version](https://img.shields.io/badge/Java-25-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0-brightgreen)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-green)](https://www.mongodb.com/)

Este projeto é uma API RESTful construída com o objetivo de demonstrar a integração entre o framework **Spring Boot** e o banco de dados orientado a documentos **MongoDB**. O projeto foca em boas práticas como o uso de DTOs, tratamento de exceções e consultas customizadas.

---

## 🚀 Tecnologias Utilizadas

* **Java 25**
* **Spring Boot 4**
* **Spring Data MongoDB**
* **Maven** para gerenciamento de dependências

## 📋 Funcionalidades

A API simula um sistema simplificado de rede social:
- **CRUD de Usuários**: Cadastro, consulta, atualização e exclusão.
- **Gestão de Posts**: Associação de posts a usuários.
- **Sistema de Comentários**: Inserção de comentários em posts.
- **Buscas Personalizadas**: Consultas utilizando `@Query` e query methods.

## 🏗️ Arquitetura das Camadas

O projeto segue o padrão de camadas para garantir a separação de responsabilidades:
1. **Resource**: Controladores REST que expõem os endpoints.
2. **Service**: Camada de lógica de negócio e validações.
3. **Repository**: Interface de comunicação com o MongoDB.
4. **Domain**: Entidades que mapeiam as coleções no banco.
5. **DTO (Data Transfer Object)**: Objetos para trafegar dados de forma otimizada.

## 🔧 Como Executar

### Pré-requisitos
- JDK 25 ou superior.
- Maven.
- MongoDB rodando localmente (porta 27017).

### Passo a passo
1. Clone o repositório:
   ```bash
   git clone [https://github.com/lucasgcunha/workshop-springboot4-mongodb.git](https://github.com/lucasgcunha/workshop-springboot4-mongodb.git)
2. Entre na pasta do projeto:
   ```bash
   cd workshop-springboot4-mongodb
3. Clone o repositório:
   ```bash
   mvn spring-boot:run

## 📋 Autor

#Lucas Cunha

- LinkedIn: [link](https://linkedin.com/in/lucas-granier-623504263)
