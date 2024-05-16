
package atributos_persona;

import java.util.Scanner;

public class Persona {
 int edad;
 String genero;
 String nombre;
 Scanner leer = new Scanner (System.in ); 
 
 public void edad(){
     System.out.println("ahora proporciona tu edad ");
     edad= leer.nextInt();
 }
    public void nombre(){
     System.out.println("Hola proporciona tu noombre ");
     nombre= leer.next();
     
 }
    public void genero(){
     System.out.println(" proporciona tu genero ");
     genero= leer.next();
     
    }
     public void resultados(){
     System.out.println(" TUS DATOS INGRESADOS SON : ");
         System.out.println("NOMBRE: "+nombre);
         System.out.println("EDAD: "+edad);
         System.out.println("GENERO: "+genero);
     
    }
}
