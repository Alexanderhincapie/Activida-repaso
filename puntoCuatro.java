
package puntotres;

import java.util.Scanner;

public class puntoCuatro {
    
     public static void main(String[] args) {
    
          Scanner leer = new Scanner (System.in);
          
          int exponente, base, respuesta;
          int j = 0;
          
          System.out.println("ingrese cuantas veces desea hallar la potencia .");
          j = leer.nextInt();
          
          for(int k = 0; k < j; k++  ){
              
            System.out.println("ingrese base .");
              base = leer.nextInt();
            
             System.out.println("ingrese exponente .");
             exponente = leer.nextInt();
          
            respuesta = potencia(base, exponente);
            System.out.println("la potencia es " + respuesta);
          }
           System.out.println("la cantida de veces que potencio fue :" + j);
    }
     
     public static int operacion (int resultado, int base){
     
         int suma = 0;
         for(int i = 0; i< resultado; i++){
         
             suma = suma + base;
         }
         return suma;
     }
     
      public static int potencia (int base, int exponente){
     
         int resultado = 1;
         for(int i = 0; i < exponente; i++){
             resultado = operacion(resultado, base);
         }
            return resultado;
     }
}