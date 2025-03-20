import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int valor01,valor1,valor02,valor2;
        float valor03,valor3,total;

        valor01 = ler.nextInt();
        valor02 = ler.nextInt();
        valor03 = ler.nextFloat();

        valor1 = ler.nextInt();
        valor2 = ler.nextInt();
        valor3 = ler.nextFloat();

        total = (valor02*valor03)+(valor2*valor3);
        System.out.printf("%.2f", total);
    }  
}
