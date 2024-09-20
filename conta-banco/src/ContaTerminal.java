import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Conhecer e importar a classe scanner
        // int numeroConta = 1021;
        // String agencia = "067-8";
        // String nomeCliente = "Mario Andrade";
        // double saldo = 237.48;

        // Exibir as msgs para o usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a msg da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia + ", conta: " + numeroConta);
        System.out.println("Seu saldo de R$ " + saldo + " já está disponível.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
