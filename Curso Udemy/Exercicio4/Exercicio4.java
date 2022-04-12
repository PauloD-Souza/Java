package Exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
      
      
      int opcao = 0;
  
      do {
        String oopcao = JOptionPane.showInputDialog(null, "Escolha uma opção \n" + "1 - iniciar um jogo \n" + "2 - Ajuda \n" + "3 - Sair");
        opcao = Integer.parseInt(oopcao);
      } while (opcao != 3);
      System.out.println("Obrigado");
    }
  }
