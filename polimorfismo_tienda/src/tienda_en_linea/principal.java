
package tienda_en_linea;


public class principal{
    
public static void main (String [] args){
 Producto producto = new Producto("natalie",25.0) {
     @Override
     public double aplicardescuento(double porcentaje) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
 }; 
producto.setPrecio(38);
    System.out.println(producto.getPrecio());
    
    Electronico obj1=new Electronico("Paula",20,"mave",3);
}    
}
