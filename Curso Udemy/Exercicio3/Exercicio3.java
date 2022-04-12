package Exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int out,in;
        out =0;
        in = 0;
        for (int i =0; i <x; i++){
            int n = leitor.nextInt();
            if ((n >= 10 ) && (n <= 100)){
                in +=1;
            }else {
                out +=1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        leitor.close();
    }
}
