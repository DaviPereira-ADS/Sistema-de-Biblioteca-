# Sistema de Biblioteca

Este é um sistema simples para gerenciar o empréstimo de livros em uma biblioteca, implementado em Java utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite cadastrar livros, usuários, registrar empréstimos e devoluções de livros, e listar os registros.

## Funcionalidades

- **Cadastrar Livro**: Adicionar novos livros ao sistema com informações como ID, título, autor e ISBN.
- **Cadastrar Usuário**: Registrar novos usuários no sistema com ID, nome e e-mail.
- **Registrar Empréstimo**: Realizar o empréstimo de um livro para um usuário registrado.
- **Registrar Devolução**: Marcar a devolução de um livro emprestado.
- **Listar Livros**: Exibir todos os livros cadastrados.
- **Listar Usuários**: Exibir todos os usuários cadastrados.

## Estrutura do Projeto

O projeto segue uma estrutura organizada em pacotes para separar responsabilidades:

- **model**: Contém as classes que representam as entidades principais do sistema (`Livro`, `Usuario`, `Emprestimo`).
- **repository**: Contém as classes responsáveis por armazenar e gerenciar os dados em listas (`LivroRepository`, `UsuarioRepository`, `EmprestimoRepository`).
- **service**: Contém as classes que encapsulam a lógica de negócio do sistema (`LivroService`, `UsuarioService`, `EmprestimoService`).
- **controller**: Contém a classe que coordena a interação entre os serviços e o repositório, servindo como ponto de entrada do sistema (`BibliotecaController`).
- **main**: Contém a classe principal para execução do sistema (`BibliotecaMain`).

## Conceitos de POO Aplicados

- **Encapsulamento**: As classes possuem atributos privados e expõem seu comportamento através de métodos públicos.
- **Herança**: A classe `Aluno` (não implementada no exemplo) poderia herdar da classe `Usuario` para adicionar comportamentos específicos de alunos.
- **Polimorfismo**: Utilizado principalmente nas interações com as entidades e serviços.
- **Associação de Objetos**: Relacionamento entre `Livro`, `Usuario` e `Emprestimo`.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/usuario/sistema-biblioteca.git
   ```
2. **Compile o código**:

   Compile as classes Java utilizando um IDE ou pelo terminal com o comando:
   ```bash
   javac -d bin -sourcepath src src/main/BibliotecaMain.java
   ```
3. **Execute o programa**:
   ```bash
   java -cp bin main.BibliotecaMain
   ```
   
4. **Interaja com o sistema**:

O sistema apresentará um menu interativo no console onde você poderá cadastrar livros, usuários, registrar empréstimos e devoluções, listar registros, etc.

## Exemplo de Uso
```bash
Escolha uma opção:
1. Cadastrar Livro
2. Cadastrar Usuário
3. Registrar Empréstimo
4. Registrar Devolução
5. Listar Livros
6. Listar Usuários
7. Sair
```
## Requisitos

Java 8 ou superior instalado.

## Imagens do sistema:
https://github.com/user-attachments/assets/0118bcb3-9082-4528-b4bd-e7074929c5cd

## Contribuições

Contribuições são bem-vindas! Se você tiver alguma sugestão ou encontrar algum bug, fique à vontade para abrir uma issue ou enviar um pull request. Projeto para fins de estudo acadêmico em Java.

