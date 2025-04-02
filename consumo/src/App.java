import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X;
        float Y, consumo;

        X = sc.nextInt();
        Y = sc.nextFloat();
        consumo = X/Y;

        System.out.printf("%.3f km/l\n",consumo);
    }
}
