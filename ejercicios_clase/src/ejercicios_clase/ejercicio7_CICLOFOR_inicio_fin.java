
package ejercicios_clase;

import java.util.Scanner;
public class ejercicio7_CICLOFOR_inicio_fin {
   public static void   ejercicio7_CICLOFOR_inicio_fin(){
       int inicio;
       int fin;
       int i;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresa un numero que sera el inicio del ciclo");
       inicio= leer.nextInt();
       System.out.println("Ingresa un numero que sera el fin del ciclo");
       fin= leer.nextInt();
       for(i=inicio; i<= fin; i+=2){
           System.out.println(i); 
       }
       
   }
}
