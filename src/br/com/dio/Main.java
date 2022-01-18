package br.com.dio;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Juliano");

        Conta cc = new ContaCorrente(cliente);

        cc.depositar(200);

        Conta cp = new ContaPoupanca(cliente);

        cc.trasferir(50,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
