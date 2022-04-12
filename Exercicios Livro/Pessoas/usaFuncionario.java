package Pessoas;

import java.util.Scanner;

public class usaFuncionario {
    public static void main(String[] args) {

        funcionario funcionarios = new funcionario();
        Scanner leitor = new Scanner(System.in);
        funcionarios.setNome(leitor.nextLine());
        funcionarios.setCartao(leitor.nextLine());
        funcionarios.setRg(leitor.nextLine());
        System.out.println(funcionarios.getNome());
        System.out.println(funcionarios.getCartao());
        System.out.println(funcionarios.getRg());
        leitor.close();
    }
}

