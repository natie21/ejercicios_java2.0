
package ejercicios_clase;
import java.util.Scanner;
public class ejercicio8_tablamult_conFOR {
 public static void  ejercicio8_tablamult_conFOR(){
     int i;
     int tabla;
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingresa la tabla de multiplicar que deseeas obtener");
     tabla=leer.nextInt();
     for(i=1; i<= 10; i++){
     System.out.println(tabla+"x"+i+"="+ tabla*i);
         
     }
       
     }
 }  

