package Pessoas;

import javax.swing.JOptionPane;

public class PessoaPolimorfa {
    public static void main(String[] args) {
       
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 4"));
        switch (tipo){

            case 1:
                System.out.println("errado");
                break;
            case 2:
                System.out.println("certo");
                break;
            case 3: 
                System.out.println("quase");
                break;
        }
    }
}
