package Exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();
        Scanner leitor = new Scanner(System.in);
        funcionario.setNome(leitor.nextLine());
        leitor.close();
    }
}
