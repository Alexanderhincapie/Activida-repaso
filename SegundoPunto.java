
package segundopunto;

import java.util.Scanner;

public class SegundoPunto {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String palabra;
        char []palíndromo;
        int iz, de;
        System.out.println("Ingrese palabra");
        palabra = leer.nextLine();
        palíndromo = palabra.toCharArray();
        iz = 0;
        de = palíndromo.length - 1;
        
        while(iz < de){
            if (palíndromo[iz] == palíndromo[de]){
            de --;
            iz++;
            }else{
                System.out.println("La palabra no es una palíndromo ");
                break;
            }
        }
        
        if(iz == de){
            System.out.println("La palabra es palíndromo ");
        }
    }
}