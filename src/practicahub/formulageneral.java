/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicahub;

import java.util.Scanner;

/**
 *
 * @author Leesly, Sergio, Daniel
 */
public class formulageneral {
   public static void main(String[] args) {
    Scanner t = new Scanner (System.in);
        double a,b,c,d,x1,x2 = 0;
        
        System.out.println("ingresa el coeficiente a");
        a = t.nextInt();
        System.out.println("Ingresa el coeficiente b");
        b = t.nextInt();
        System.out.println("Ingresa el coeficiente c");
        c = t.nextInt();
        
        d = Math.pow(b,2) - (4*a*c);
        
        if(d<0){
            System.out.println("La solucion no es real");
        }else{
            x1 = (-b + Math.sqrt(d)) / (2*a);
            
            x2 = (-b - Math.sqrt(d)) / (2*a);
            
            System.out.println(); 
            System.out.printf("La solucion es:\nx1: %f\nx2: %f",x1,x2);
        }
   }
}
