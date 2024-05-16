
package ejercicios_clase;

import java.util.Scanner;


public class ejercicio10_switch {
    public static void ejercicio10_switch(){
        int op;
        Scanner leer = new Scanner (System.in);
        System.out.println("1; Hola mundo");  
       System.out.println("2; Hola mundo");   
       
       op=leer.nextInt();
         
         switch(op){
             
             case 1:
                 System.out.println("Hola mundo");
             break;
             case 2:
                  System.out.println("Hola grupo");
             break;
             default:
                 System.out.println("Esa opcion no esta disponible ");
         }
    }
    
}
