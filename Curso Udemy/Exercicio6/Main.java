package Exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Enter produto data");
        System.out.println("nome");
        produto.setNome(leitor.nextLine());
        System.out.println("Digite a quantidade");
        produto.setQuatidade(leitor.nextInt());
        System.out.println("Qual o preço do produto");
        produto.setPreco(leitor.nextDouble());
        System.out.println(produto.toString());
        System.out.println();
        System.out.println("Digite quantos produto devem ser adicionado ao estoque ");
        int quantidade = leitor.nextInt();
        produto.addProduto(quantidade);
        System.out.println(produto.toString());
        System.out.println();
        System.out.println("Digite quantos produto devem ser removido ao estoque ");
        quantidade = leitor.nextInt();
        produto.RemoveProduto(quantidade);
        System.out.println(produto.toString());

        leitor.close();
    }
}
