public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente reinan = new Cliente("Reinan");
        Cliente kaua = new Cliente("Kauã");
        Cliente oliveira = new Cliente("Oliveira");
        Cliente morais = new Cliente("Morais");
        Cliente joao = new Cliente("João");

        banco.adicionarCliente( new Cliente("Reinan"));
        banco.adicionarCliente(kaua);
        banco.adicionarCliente(oliveira);
        banco.adicionarCliente(morais);
        banco.adicionarCliente(joao);

        Conta cc1 = new ContaCorrente(reinan);
        Conta cc2 = new ContaCorrente(kaua);
        Conta cc3 = new ContaCorrente(oliveira);
        Conta cc4 = new ContaCorrente(morais);
        Conta cp1 = new ContaPoupança(joao);


        cc1.depositar(100);
        cc1.depositar(800);
        cc1.transferir(100, cc4);

        cc1.imprimirExtrato();
        cc4.imprimirExtrato();

        banco.listarClientes();


    }
}
