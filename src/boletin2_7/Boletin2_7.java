
package boletin2_7;

import java.util.Scanner;

public class Boletin2_7 {

    public static void main(String[] args) {
        float c, f, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el valor de C");
        c = sc.nextFloat();
        f = 2f+1.8f*c;
        k = c+273;
        System.out.println(c+"C = "+f+"F");
        System.out.println(c+"C = "+k+"K");
    }
    
}
