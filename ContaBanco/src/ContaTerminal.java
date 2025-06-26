import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Configurar Locale para formato de moeda e importar Scanner
        Locale.setDefault(Locale.US);
        // Logica para ler os dados da conta do cliente dentro do bloco try para fechar o Scanner automaticamente
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Por favor, digite o número da Agencia: ");
            String numeroAgencia = sc.nextLine();
            System.out.print("Por favor, digite o seu nome: ");
            String nomeCliente = sc.nextLine();
            System.out.print("Por favor, digite o saldo da conta: ");
            Double saldoConta = sc.nextDouble();
            // Exibir a mensagem de conta criada
            System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                    nomeCliente, numeroAgencia, numeroConta, saldoConta);
        }
    }
}