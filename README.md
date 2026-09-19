## 🚜 RutaAgro | Autonomous Tractor Telemetry API

 🚧 **Status: Work in Progress (Early Development)**

## 📖 About the Project
RutaAgro is a REST API designed to solve a critical challenge in the Agritech sector: collecting telemetry data from autonomous tractors operating in rural areas with intermittent or zero internet connectivity. 

To achieve this, the system implements an **Offline-First architecture**, ensuring no data is lost during field operations.

## 🏗️ Architecture & Tech Stack
- **Language:** Java
- **Framework:** Spring Boot
- **Local Persistence (Vehicle):** SQLite (stores data offline)
- **Central Persistence (Cloud):** PostgreSQL (syncs data when connection is restored)
- **Development Practices:** Strict Object-Oriented Programming (OOP) and Conventional Commits.

## 🚀 Current Roadmap
- [x] Initial project setup and folder structure
- [x] Domain modeling (Entities and Enums)
- [ ] Database connection and hybrid persistence setup
- [ ] Synchronization logic (SQLite -> PostgreSQL)
- [ ] REST API Endpoints creation
- [ ] Unit and Integration Tests

## 🤝 How to follow along
This project is currently under active development. Feel free to star the repository to follow the architectural evolution, or reach out to me on [LinkedIn](www.linkedin.com/in/pedro-paulo-ba5735179) to discuss the technical choices!

-----------------------------------------------------------

# 🚜 RutaAgro | API de Telemetria para Tratores Autônomos

> 🚧 **Status: Em Desenvolvimento (Fase Inicial)** 🚧

## 📖 Sobre o Projeto
O RutaAgro é uma API REST projetada para resolver um desafio crítico no setor Agritech: a coleta de dados de telemetria de tratores autônomos operando em áreas rurais com conexão de internet intermitente ou inexistente. 

Para solucionar isso, o sistema implementa uma **arquitetura Offline-First** (Prioridade Offline), garantindo que nenhum dado seja perdido durante as operações no campo.

## 🏗️ Arquitetura e Tecnologias
- **Linguagem:** Java
- **Framework:** Spring Boot
- **Persistência Local (Veículo):** SQLite (armazena os dados offline)
- **Persistência Central (Nuvem):** PostgreSQL (sincroniza os dados quando a conexão é restabelecida)
- **Práticas de Desenvolvimento:** Programação Orientada a Objetos (POO) rigorosa e versionamento com Conventional Commits.

## 🚀 Roadmap Atual
- [x] Configuração inicial do projeto e estrutura de pastas
- [x] Modelagem de domínio (Entidades e Enums)
- [ ] Conexão com o banco de dados e configuração da persistência híbrida
- [ ] Lógica de sincronização (SQLite -> PostgreSQL)
- [ ] Criação dos Endpoints da API REST
- [ ] Testes Unitários e de Integração

## 🤝 Como acompanhar
Este projeto está em desenvolvimento ativo. Sinta-se à vontade para dar uma estrela (star) no repositório para acompanhar a evolução da arquitetura, ou conecte-se comigo no [LinkedIn](www.linkedin.com/in/pedro-paulo-ba5735179) para discutirmos essas escolhas técnicas!
