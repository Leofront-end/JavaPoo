import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> dicionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int DDD;

        dicionario.put(61, "Brasilia");
        dicionario.put(71, "Salvador");
        dicionario.put(11, "Sao Paulo");
        dicionario.put(21, "Rio de Janeiro");
        dicionario.put(32, "Juiz de Fora");
        dicionario.put(19, "Campinas");
        dicionario.put(27, "Vitoria");
        dicionario.put(31, "Belo Horizonte");

        DDD = sc.nextInt();
        if (dicionario.containsKey(DDD)) {
            System.out.println(dicionario.get(DDD));
        } else {
            System.out.println("DDD nao cadastrado");
        }
        
    }
}
