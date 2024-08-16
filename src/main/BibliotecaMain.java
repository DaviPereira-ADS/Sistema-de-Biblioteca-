package main;

import controller.BibliotecaController;
import model.Livro;
import model.Usuario;
import repository.EmprestimoRepository;
import repository.LivroRepository;
import repository.UsuarioRepository;
import service.EmprestimoService;
import service.LivroService;
import service.UsuarioService;

import java.util.Scanner;

public class BibliotecaMain {
	public static void main(String[] args) {
		// Instanciando os repositórios
		LivroRepository livroRepository = new LivroRepository();
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

		// Instanciando os serviços
		LivroService livroService = new LivroService(livroRepository);
		UsuarioService usuarioService = new UsuarioService(usuarioRepository);
		EmprestimoService emprestimoService = new EmprestimoService(emprestimoRepository, livroRepository,
				usuarioRepository);

		// Instanciando o controlador
		BibliotecaController bibliotecaController = new BibliotecaController(livroService, usuarioService,
				emprestimoService);

		// Scanner para entradas do usuário
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------");
			System.out.println("Escolha uma opção:");
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Cadastrar Usuário");
			System.out.println("3. Registrar Empréstimo");
			System.out.println("4. Registrar Devolução");
			System.out.println("5. Listar Livros");
			System.out.println("6. Listar Usuários");
			System.out.println("7. Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

			switch (opcao) {
			case 1:
				System.out.print("Digite o ID do Livro: ");
				String livroId = scanner.nextLine();
				System.out.print("Digite o Título do Livro: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o Autor do Livro: ");
				String autor = scanner.nextLine();
				System.out.print("Digite o ISBN do Livro: ");
				String isbn = scanner.nextLine();
				Livro livro = new Livro(livroId, titulo, autor, isbn);
				bibliotecaController.cadastrarLivro(livro);
				System.out.println("Livro cadastrado com sucesso!");
				break;

			case 2:
				System.out.print("Digite o ID do Usuário: ");
				String usuarioId = scanner.nextLine();
				System.out.print("Digite o Nome do Usuário: ");
				String nome = scanner.nextLine();
				System.out.print("Digite o Email do Usuário: ");
				String email = scanner.nextLine();
				Usuario usuario = new Usuario(usuarioId, nome, email);
				bibliotecaController.cadastrarUsuario(usuario);
				System.out.println("Usuário cadastrado com sucesso!");
				break;

			case 3:
				System.out.print("Digite o ID do Livro para Empréstimo: ");
				String emprestimoLivroId = scanner.nextLine();
				System.out.print("Digite o ID do Usuário para Empréstimo: ");
				String emprestimoUsuarioId = scanner.nextLine();
				bibliotecaController.registrarEmprestimo(emprestimoLivroId, emprestimoUsuarioId);
				System.out.println("Empréstimo registrado com sucesso!");
				break;

			case 4:
				System.out.print("Digite o ID do Empréstimo para Devolução: ");
				String emprestimoId = scanner.nextLine();
				bibliotecaController.registrarDevolucao(emprestimoId);
				System.out.println("Devolução registrada com sucesso!");
				break;

			case 5:
				System.out.println("Livros disponíveis:");
				bibliotecaController.listarLivros()
						.forEach(livroDisponivel -> System.out.println(livroDisponivel.getTitulo()));
				break;

			case 6:
				System.out.println("Usuários cadastrados:");
				bibliotecaController.listarUsuarios()
						.forEach(usuarioCadastrado -> System.out.println(usuarioCadastrado.getNome()));
				break;

			case 7:
				System.out.println("Saindo do sistema...");
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida, tente novamente.");
			}
		}
	}
}
