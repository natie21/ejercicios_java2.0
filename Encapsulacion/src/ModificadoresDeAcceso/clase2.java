
package ModificadoresDeAcceso;


public class clase2 {
  public void metodoclase2(){
    clase1 obj1 = new clase1();
      System.out.println("Desde el mismo paquete");
      System.out.println("a = "+obj1.a);
      System.out.println("b = "+obj1.b);
      System.out.println("c = "+obj1.c);
      System.out.println("La edad es : "+obj1.getEdad());
      System.out.println("se intento cambiar la edad");
      obj1.setEdad(32);
      System.out.println(obj1.getEdad());
  }  
}
