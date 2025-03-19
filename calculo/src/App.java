import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        int valor1,valor2;
        float valor3;

        valor1 = num.nextInt();
        valor2 = num.nextInt();
        valor3 = num.nextFloat();
        num.close();
        System.out.print(valor1);
        System.out.print(valor2);
        System.out.print(valor3);
    }
}
