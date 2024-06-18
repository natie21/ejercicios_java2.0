
package constantes;


public class EjemploConstantes {
 //forma de definir constante
 final String nombre= "NATALIE";
    // otr forma con constructor
 //final String nombre;
// public EjemploConstantes (String nombre){
 //    this.nombre=nombre;
 //}
    public static void main(String[] args) {
     EjemploConstantes ob1= new EjemploConstantes() ;
     EjemploConstantes ob2= new EjemploConstantes() ;
     
        System.out.println("nombre: "+ob1.nombre);
        System.out.println("nombre: "+ob2.nombre);
    }
}
