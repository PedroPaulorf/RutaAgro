# RutaAgro

Backend Java para registrar operações agrícolas e, futuramente, sincronizar rotas e telemetria coletadas sem internet.

**Status:** em desenvolvimento, como projeto de aprendizado e portfólio.

## O problema

A conectividade no campo pode ser intermitente. O objetivo do RutaAgro é permitir que um dispositivo registre a operação localmente e envie os dados ao servidor quando recuperar a conexão.

## Tecnologias

- Java 25 e Spring Boot 4.1.2
- Spring Data JPA / Hibernate e Jakarta Validation
- PostgreSQL e migrações Flyway
- Maven e JUnit 5
- SQLite: dependência preparada para a futura persistência offline

## Estado atual

- Entidades `Tractor` e `Mission`, com identificadores UUID.
- Relacionamento entre missão e trator.
- Inicialização Spring Boot e configuração PostgreSQL.
- Migração inicial das tabelas e validação do esquema pelo Hibernate.
- Repositório de tratores e teste de carregamento do contexto.

O cadastro pela API está em construção. Ainda não há Controller disponível. Coleta de telemetria, mapas, autenticação e sincronização offline são funcionalidades planejadas.

## Arquitetura

Fluxo do backend em construção:

```text
Cliente HTTP → Controller → Service → Repository → PostgreSQL
```

Fluxo offline planejado:

```text
Dispositivo → SQLite → fila de sincronização → API → PostgreSQL → dashboard
```

A presença dos drivers SQLite e PostgreSQL não significa que a sincronização já esteja implementada.

## Executar localmente

Requisitos: JDK 25, Maven e PostgreSQL em execução na porta 5432.

1. Crie um banco chamado `rutaagro` no PostgreSQL.
2. Abra o PowerShell na raiz deste repositório e configure as credenciais:

```powershell
$env:RUTAAGRO_DB_USERNAME = 'seu_usuario'
$env:RUTAAGRO_DB_PASSWORD = 'sua_senha'
cd RutaAgro/rutaagro
mvn spring-boot:run
```

O Flyway aplica as migrações ao iniciar. O Hibernate valida as tabelas existentes. Por padrão, o servidor usa a porta 8080; enquanto os Controllers não forem implementados, acessar uma rota de negócio pode retornar 404.

## Compilar e testar

Na pasta `RutaAgro/rutaagro`:

```powershell
mvn compile
mvn test
```

Os testes com perfil `test` usam o banco separado `rutaagro_test`. Crie esse banco e configure as mesmas variáveis de credenciais antes de executá-los. Os testes de integração precisam do PostgreSQL disponível.

## Estrutura

```text
RutaAgro/rutaagro/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/rutaagro/
    │   │   ├── dto/
    │   │   ├── enums/
    │   │   ├── model/
    │   │   └── repository/
    │   └── resources/
    │       ├── application.properties
    │       └── db/migration/
    └── test/
```

## Próximas entregas

- [ ] Concluir DTOs, serviço e endpoints de cadastro/listagem de tratores.
- [ ] Implementar o ciclo de vida das missões e suas regras.
- [ ] Registrar posições e telemetria simuladas.
- [ ] Persistir dados no dispositivo sem conexão.
- [ ] Implementar fila, confirmação de recebimento e prevenção de duplicidade.
- [ ] Adicionar autenticação, dashboard e mapas.
- [ ] Documentar e demonstrar o fluxo completo offline → sincronização.

## Contribuição

Veja [CONTRIBUTING.md](CONTRIBUTING.md) para organização das alterações e verificações.

## Autor

[Pedro Paulo](https://github.com/PedroPaulorf) · [LinkedIn](https://www.linkedin.com/in/pedro-paulo-ba5735179/)

