package Exercicio1;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "Computer";
        String produto2 = "Ofice desk";
        int age = 23;
        char sex = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double medida = 53.4245;
        System.out.printf(produto1 + " com o preço de "+ "%.2f\n",price1);
        System.out.printf(produto2 + " com preço de " +"%.2f\n", price2);

        System.out.println("Recorde com " +age +" Anos de idade do sexo "+ sex);
        
        Locale.setDefault(Locale.US);
        System.out.printf(" o recorde dele foi de " + "%.3f\n",medida);
    }

}

    
