
package herencia;


public class Perro extends Animal{
    // atributos
    
    //constructores
    public Perro(String nombre, int edad ){
        //super para acceder a los atributos de la clase padre
        super(nombre,edad); 
    }
    
    // metodos
    public void ladrar(){
        System.out.println(getNombre()+" esta ladrando");
    }
}
