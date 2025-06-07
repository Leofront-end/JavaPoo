import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num, horas;
        float valor, salario;

        num = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextFloat();
        salario = valor * horas;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}
