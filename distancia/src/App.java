import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int km,Resultado;

        km = sc.nextInt();
        Resultado = km * 2;

        System.out.println(Resultado + " minutos");
    }
}
