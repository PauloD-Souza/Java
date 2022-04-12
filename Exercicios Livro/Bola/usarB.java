package Bola;

import java.util.Scanner;

public class usarB {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        usarBola bolaJ = new usarBola(leitor.nextLine(),leitor.nextInt(),leitor.next());
        bolaJ.Mostrar();
        leitor.close();
    }
}
