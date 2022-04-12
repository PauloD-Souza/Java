import java.util.Scanner;

public class distanciaCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        int tempoDis = 2;
        int tempo = distancia * tempoDis;
        System.out.println(tempo + " minutos");


        sc.close();
    }
}
