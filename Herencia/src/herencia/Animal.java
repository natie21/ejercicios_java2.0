
package herencia;

public class Animal {
 // atributos
  private String nombre;
  private int edad;
  
  //constructores
  public Animal (String nombre, int edad){
    this.nombre= nombre;
    this.edad= edad;
  }
  
  //metodos
  public void comer (){
      System.out.println(nombre+"esta cominedo");
      
  }
   public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
