import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int repeticao, parOuImpar;

        repeticao = sc.nextInt();
        for (int i = 0; i < repeticao; i++) {
            parOuImpar = sc.nextInt();

            if (parOuImpar == 0) {
                System.out.println("NULL");
            } else {
                if (parOuImpar > 0) {
                    if (parOuImpar % 2 == 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("ODD POSITIVE");
                    }
                } else {
                    if (parOuImpar % 2 == 0) {
                        System.out.println("EVEN NEGATIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }
    }
}
