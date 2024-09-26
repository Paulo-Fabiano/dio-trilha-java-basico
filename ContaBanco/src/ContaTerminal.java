import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        float saldoBancario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta bancária: ");
        numeroConta = scanner.nextInt();

        System.out.println("Agora insira o dígito da sua conta bancaária: ");
        numeroAgencia = scanner.next();

        System.out.println("Agora informe seu saldo bancário: ");
        saldoBancario = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em noso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo R$" + saldoBancario + " já disponível para saque.");

        scanner.close();

    };

};
