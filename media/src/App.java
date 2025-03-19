import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String A1,B1;
        double A,B,M;
        Scanner num = new Scanner(System.in);

        A1 = num.next();
        B1 = num.next();
        A = Double.parseDouble(A1);
        B = Double.parseDouble(B1);
        M = (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f",M);
    }
}
