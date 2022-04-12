import java.util.Scanner;

public class autonomia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas = sc.nextDouble();
        double velocidade = sc.nextDouble();
        int autonomiaL = 12;
        double gasto = (horas * velocidade)/autonomiaL;
        System.out.printf("%.2f",gasto);
        sc.close();
    }
}
