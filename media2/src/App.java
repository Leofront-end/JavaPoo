import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A,B,C,R;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        R = (A*2+B*3+C*5)/10;

        System.out.printf("MEDIA = %.1f\n",R);
    }
}
