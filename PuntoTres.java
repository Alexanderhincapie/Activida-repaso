
package puntotres;

import java.util.Scanner;

public class PuntoTres {

    public static void main(String[] args) {
       
         Scanner leer = new Scanner (System.in);
         
         int num1 =0;
         int num2 = 0;
         int res = 0;
         
         System.out.println("Ingrese numero 1 .");
         num1 = leer.nextInt();
         
         System.out.println("Ingrese numero 2 .");
         num2 = leer.nextInt();
         //2*3, 2+2+2 = 6
         
         while (num2 != 0){
        
            res = res + num1;
            num2 = num2 -1;
    
    }
        System.out.println("La operacion es :" + res);  
         
    }
    
}
