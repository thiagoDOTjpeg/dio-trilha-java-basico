import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        float saldoConta;

        System.out.println("\n------------ Terminal Banco ------------\n");

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agenciaConta = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldoConta = scanner.nextFloat();

        System.out.println("\n------------ Dados da Conta ------------\n");
        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta
                        + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

        scanner.close();
    }
}
