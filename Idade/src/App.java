import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int idade,ano,Rano,mes,dia;
        idade = leia.nextInt();
        ano = idade / 365;
        Rano = idade % 365;
        mes = Rano / 30;
        dia = Rano % 30;

        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
        
    }
}
