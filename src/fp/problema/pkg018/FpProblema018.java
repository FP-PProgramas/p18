/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg018;
import java.util.*;
/**
 *
 * @author karen
 */
public class FpProblema018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Teclea primer num");
        int a = sc.nextInt();
        System.out.println("Teclea segundo num");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int mcm = 0;
         for (int i=1; i<=min; i++) {
            if (a%i==0 && b%i==0) {
                int mcd = i;
                mcm = (a*b)/mcd;
            }
        }
        
        System.out.println("El MCM es: "+mcm);
    }
     
}
