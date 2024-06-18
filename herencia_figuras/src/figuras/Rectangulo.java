
package figuras;


public class Rectangulo extends FiguraGeometrica {
    public String Arear ;
    
    public Rectangulo (int ltriangulo, int lrectangulo,String Arear){
       super(ltriangulo,lrectangulo);
       this.Arear=Arear;
    }
    
    public void AreaRectangulo(){
        System.out.println("La formula del area de un rectangulo es :"+Arear);
    }
}
