import java.lang.Math;
import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x1 =sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double pontos = Math.sqrt (Math.pow((x2 - x1),2 ) + Math.pow((y2 - y1) ,2  ));
        System.out.printf("%.3f", pontos);
        sc.close();
     
    }

}