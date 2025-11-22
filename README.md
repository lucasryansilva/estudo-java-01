# estudo-java-01
Um sistema simples para registrar novos usuários ou logar caso já exista um registro, também é possível fazer buscas para encontrar um usuário já cadastrado no sistema.
Para fazer esse sistema usei Java como linguagem principal e um banco de dados (PostgreSQL) nunca havia usado antes, porém quis testar e aprender sobre.

![Demonstração](https://media4.giphy.com/media/v1.Y2lkPTc5MGI3NjExNzJybm15ODZyNWgwY3Nzb3J6eWhtd213bzVjMHB6MWFhcHk5OG96OSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/YkgF7GYXZdzj8uNnjR/giphy.gif)

**Cadastrar um usuário**
Para fazer um cadastro é necessário as seguintes informações:
1º CPF;
2º Nome;
3º Data de Nascimento;
4º E-mail;
5º Senha.

---

**Fazer Login**
Para logar é preciso:
1º CPF;
2º E-mail;
3º Senha.

---

**Fazer buscas**
Para buscar algum usuário no sistema é preciso do CPF.

---

**Processo de Criação**
Usei Java como linguagem principal junto com o PostgreSQL para armazenar as informações, assim que o projeto é executado, é criado uma conexão com o banco de dados onde faz uma leitura de todas as colunas da tabela e manda as informações dos usuários para uma HashMap, achei melhor enviar tudo para uma HashMap para evitar ficar criando várias conexões a cada função que for executada, dessa forma eu usei o CPF como chave primária, já que só existe um único CPF por usuário, então eu faço a pesquisa pelo CPF dentro da HashMap e retorno os valores que eu preciso tanto para Login quanto para Pesquisas.




