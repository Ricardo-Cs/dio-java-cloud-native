import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Bem Vindo ao nosso banco! Para iniciar, pediremos os seus dados.");

        System.out.print("Insira o número da conta: ");
        Integer numConta = sc.nextInt();
        sc.nextLine(); // Para consumir a nova linha criada pelo \n do enter anterior.

        System.out.print("\nInsira o número da agência: ");
        String agencia = sc.nextLine();

        System.out.print("\nInsira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("\nInsira seu saldo: ");
        Double saldo = sc.nextDouble();

        String saida = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.", nome, agencia, numConta, saldo);
        System.out.println(saida);

        sc.close();
    }
}