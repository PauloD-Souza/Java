package Bola;

import java.util.Scanner;

public class jogar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        usarBola jogo = new usarBola(leitor.nextLine(),leitor.nextInt(),leitor.nextLine());
        jogo.Mostrar();
        leitor.close();

    }
}
