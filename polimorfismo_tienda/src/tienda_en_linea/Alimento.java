
package tienda_en_linea;


public class Alimento {
 private String fechaCaducidad;
 private String tipo;
 
 public Alimento(String fechaCaducidad,String tipo){
     this.fechaCaducidad=fechaCaducidad;
     this.tipo=tipo;
 }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
 
}
