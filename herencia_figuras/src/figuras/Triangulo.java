
package figuras;


public class Triangulo extends FiguraGeometrica {
    
 public String Areat ;
 
    public Triangulo(int ltriangulo, int lrectangulo,String Areat) {
        super(ltriangulo, lrectangulo);
        this.Areat=Areat;
        
    }
 public void areas(){
     System.out.println("La formula para obtener el area de un triangulo es: "+ Areat);
 }
    
}
