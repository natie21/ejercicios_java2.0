
package tienda_en_linea;
public class Electronico extends Producto{
private String marca;
private int garantia;
private double porcentaje;
public double precio;
  public Electronico( String nombre, double precio,String marca, int garantia) {
     super( nombre, precio);
     this.marca=marca;
     this.garantia=garantia;  
    }

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}
public int getGarantia(){
    return garantia;
}
public void setGarantia(int garantia){
    this.garantia=garantia;
}
@Override
public double aplicardescuento(double porcentaje){
   porcentaje=porcentaje * precio /100;
  precio =precio-porcentaje;
   return precio;
 
}
}
