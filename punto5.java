
package puntotres;

import java.util.Scanner;

public class punto5 {
    
    public static void main(String[] args) {
    
          Scanner leer = new Scanner (System.in);
          
          int numero = 0;
          int fact = 1;
          
            System.out.println("ingrese numero");
            numero = leer.nextInt();
            
            for(int i = 1; i <= numero; i++){
                fact = fact *i;
            }
            
            System.out.println("el resultado factorial del numero ingresado es :" + fact);
    
    }
}