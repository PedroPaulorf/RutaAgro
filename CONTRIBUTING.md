# Contribuindo

O RutaAgro é um projeto de aprendizado. Prefira mudanças pequenas e explique a regra de negócio envolvida.

1. Crie uma branch descritiva para a alteração.
2. Evite misturar documentação, refatorações e novas funcionalidades sem necessidade.
3. Adicione testes para regras e comportamentos novos.
4. Execute `mvn test` em `RutaAgro/rutaagro`, com PostgreSQL e banco de teste configurados.
5. Descreva no pull request o problema, a solução e como verificou o resultado.

Sugestões de prefixos de commit: `feat:`, `fix:`, `docs:`, `test:` e `chore:`.

Não versione credenciais, arquivos `.env`, bancos locais ou saídas de compilação. Alterações em tabelas já migradas devem receber uma nova migração Flyway; preserve o histórico aplicado.
