
package tienda_en_linea;


public class Ropa {
 private String talla;
 private String material;
 
 public Ropa(String talla, String material){
     this.talla=talla;
     this.material=material;
 }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
 
}
