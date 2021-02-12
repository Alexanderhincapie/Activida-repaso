
package repaso;

import java.util.Scanner;

public class Repaso {
    
    /* Studiante: Stiven Alexander Parra Hincapie
       Asignatura: Estructura de datos
       Taller Repaso de repaso Java
       Profesor: Leon Daniel Jaramillo Ramirez
    */

    public static void main(String[] args) {
      
        int N, K;
        int j, mayor= 0;
        int digitos[];
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Cantidad de numeros a ingresar :");
        N = leer.nextInt();
        digitos = new int[N];
        
        for(K=0; K < digitos.length; K++){
        
            System.out.println("Digite numero "+(K+1));
            digitos[K] = leer.nextInt();
        }
        
        for (j=0; j< digitos.length; j++){
            if (mayor<digitos[j]){
                mayor = digitos[j];
         }
    }
        System.out.println("el mayor es " + mayor);
}
    
}