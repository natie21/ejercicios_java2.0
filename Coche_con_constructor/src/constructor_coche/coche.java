
package constructor_coche;


public class coche {
 
 int precio;
 String color;
 String marca;
 
 public coche(int precio, String color, String marca){
   this.color= color;
   this.marca= marca;
   this.precio= precio;
 }
 public void im_precio(){
     System.out.println("El precio del coche es :"+ precio);  
 }
  public void im_color(){
      System.out.println("El color del coche es :"+ color);  
 }
   public void im_marca(){
       System.out.println("La marca del coche es :"+ marca); 
 }
}
