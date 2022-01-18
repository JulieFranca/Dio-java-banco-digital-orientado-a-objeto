package br.com.dio;

public class Main {
    public static void main(String[] args) {

        Cliente juliano = new Cliente();

        juliano.setNome("JULIANO");

        Cliente carla = new Cliente();
        carla.setNome("CARLA");

        Conta cc = new ContaCorrente(juliano);

        Conta cp = new ContaPoupanca(carla);



        cc.depositar(200);


        cc.trasferir(50,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
