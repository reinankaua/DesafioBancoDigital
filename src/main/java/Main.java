public class Main {
    public static void main(String[] args) {
        Cliente reinan = new Cliente("Reinan");

        Conta cc = new ContaCorrente(reinan);
        Conta cp = new ContaPoupança(reinan);

        cc.depositar(100);
        cc.depositar(800);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
