package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x, b,soma;
        x = leitor.nextInt();
        b = leitor.nextInt();
        soma = x + b;
        System.out.println(" A soma é " + soma); 
        leitor.close();
    }
}
