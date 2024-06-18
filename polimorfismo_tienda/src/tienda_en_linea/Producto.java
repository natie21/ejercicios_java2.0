
package tienda_en_linea;


public abstract class  Producto {
 private int id;
 private String nombre;
 private double precio;
 private static int contador=0;
 private final String codigo= "ABR0000";
 public Producto( String nombre,double precio){
// this.contador ++;
 //this.id= codigo + contador;
 this.id=id;
 this.nombre=nombre;
 this.precio=precio;
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
 public String getNombre(){
     return nombre;
 }
 public void setNombre(String nombre){
     this.nombre=nombre;
 }
 public double getPrecio(){
     return precio;
 }
 public void setPrecio(double precio){
     this.precio=precio;
 }
 
 public abstract double aplicardescuento(double porcentaje);
  
 public void calcularPrecioFinal(){
     System.out.println("El precion del producto (con descuento del 15% )es= "+precio);   
 }
}
