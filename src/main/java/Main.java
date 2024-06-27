import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Logins e senhas permitidos
        String[][] usuarios = {
            {"admin", "admin123"},
            {"financeiro", "fin456"},
            {"cliente", "cliente789"}
        };

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o login
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        // Solicita ao usuário que insira a senha
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        // Verifica o login e a senha
        boolean usuarioEncontrado = false;
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(login)) {
                usuarioEncontrado = true;
                if (usuario[1].equals(senha)) {
                    // Mensagem específica para cada usuário
                    switch (login) {
                        case "admin":
                            System.out.println("Bem-vindo, administrador! Acesso total concedido.");
                            break;
                        case "financeiro":
                            System.out.println("Bem-vindo, financeiro! Acesso às finanças concedido.");
                            break;
                        case "cliente":
                            System.out.println("Bem-vindo, cliente! Acesso à sua conta concedido.");
                            break;
                    }
                } else {
                    System.out.println("Senha errada.");
                }
                break;
            }
        }

        if (!usuarioEncontrado) {
            System.out.println("Usuário não encontrado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}