
package ejemplos;

public class Coche implements Vehiculo{
    private int velocidad;
     @Override
     public void arrancar(){
         System.out.println("El coche ha encendido"); 
         velocidad=10;
     }
     @Override
      public void detener(){
          System.out.println("El coche se ha detenido");
          velocidad=0;
      }
      
    @Override
      public int ObtenerVelocidad(){
        return velocidad;  
      }
}
