public class Main {

    public static void main(String[] args) {
        Cliente ricardo = new Cliente();
        ricardo.setNome("Ricardo");

        Conta cc = new ContaCorrente(ricardo);
        Conta poupanca = new ContaPoupanca(ricardo);

        cc.depositar(1020.322);
        cc.transferir(95.33, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}