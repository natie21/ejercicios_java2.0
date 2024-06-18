
package figuras;


public class Main_figuras {
public static void main( String [] args) {
    FiguraGeometrica figuras = new FiguraGeometrica(3,4);
    figuras.getltriangulo();
    figuras.getlrectangulo();
    
    //clase hija
    Triangulo triangulo = new Triangulo(3,4," A = b x h / 2");
    triangulo.getltriangulo();
    
    // clase hija
    Rectangulo rectangulo= new Rectangulo (3,4," A = b x h");
    rectangulo.AreaRectangulo();
}   
}
