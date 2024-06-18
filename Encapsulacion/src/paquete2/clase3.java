
package paquete2;
// permite heredar de la clase que estamos importando
import ModificadoresDeAcceso.clase1;


public class clase3 extends clase1{
 public void metodoClase3(){
     System.out.println("Desde un nuevo paquete");
     System.out.println("a = "+a);
     System.out.println("b = "+b);
     // System.out.println("c = "+c); dara error porque el modo en que definimos la variable no permite
    // System.out.println("d = "+d); esta definido como private 
 }   
}
