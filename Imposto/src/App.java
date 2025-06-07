import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Double renda, impostoCalculado;
        renda = sc.nextDouble();
        if (renda <= 2000) {
            System.out.println("Isento");
        } else {
            if (renda <= 3000) {
                impostoCalculado = (renda - 2000)*0.08;
            } else {
                if (renda <= 4500) {
                    impostoCalculado = (1000*0.08)+((renda - 3000)*0.18) ;
                } else {
                    impostoCalculado = (1000*0.08)+(1500*0.18)+((renda - 4500)*0.28) ;
                }
            }
            System.out.printf("R$ %.2f\n", impostoCalculado);
        }
    }
}
