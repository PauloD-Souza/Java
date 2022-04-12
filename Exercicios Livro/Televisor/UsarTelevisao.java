package Televisor;

import java.util.Scanner;

public class UsarTelevisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Televisão tv = new Televisão();
        tv.setCanal(leitor.nextInt());
        tv.DiminuirCanal();
        tv.setVolume(leitor.nextInt());
        tv.DiminuirVolume();
        System.out.println(tv.getCanal());
        System.out.println(tv.getVolume());
        leitor.close();

    }
}
