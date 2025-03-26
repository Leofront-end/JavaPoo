public class App {
    public static void main(String[] args) throws Exception {
        // corpoHumano c1 = new corpoHumano();
        // c1.setMassa(80);
        // c1.setVolume(10);
        // c1.calcularDensidade();
        // System.out.println(c1.getDensidade());

        // contaBancaria cb = new contaBancaria();
        // cb.saldo = 1000;
        // cb.titular = "leo";
        // cb.depositar(500);
        // System.out.println("O saldo é "+cb.saldo);

        // cb.sacar(500);
        // System.out.println("O saldo é "+cb.saldo);


        contaBancaria cb = new contaBancaria();
        cb.setTitular("Leo");

        cb.depositar(500);
        System.out.println("O saldo é "+cb.getSaldo());

        cb.sacar(500);
        System.out.println("O saldo é "+cb.getSaldo());
    }
}
