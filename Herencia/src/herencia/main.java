
package herencia;

public class main {
 public static void main(String [] args) {
     Perro perrito1= new Perro("Jack",3);
     
     perrito1.ladrar();
     perrito1.comer();
     
     System.out.println("la edad de "+perrito1.getNombre()+"es de "+ perrito1.getEdad()+"años");
 }      
}
