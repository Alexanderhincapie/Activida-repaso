
package puntotres;

import java.util.Scanner;

public class puntoCuatro {
    
     public static void main(String[] args) {
    
          Scanner leer = new Scanner (System.in);
          
          int exponente, base, respuesta;
          
          System.out.println("ingrese base .");
          base = leer.nextInt();
          
          System.out.println("ingrese exponente .");
          exponente = leer.nextInt();
          
          respuesta = potencia(base, exponente);
          System.out.println("la potencia es " + respuesta);
    }
     
     public static int potencia (int base, int exponente){
     
         int resultado = 1;
         for(int i = 0; i < exponente; i++){
             resultado = multiplicar(resultado, base);
         }
            return resultado;
     }
     
     public static int multiplicar (int resultado, int base){
     
         int suma = 0;
         for(int i = 0; i< resultado; i++){
         
             suma = suma + base;
         }
         return suma;
     }
}