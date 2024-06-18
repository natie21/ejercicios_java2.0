
package figuras;


public class FiguraGeometrica {
 public int ltriangulo;
 public int lrectangulo;
// public String Areat =" A = b x h / 2";
//  public String Arear =" A = b x h";
  
 //constructor 
  public FiguraGeometrica(int ltriangulo,int lrectangulo ){
 this.ltriangulo=ltriangulo;
this.lrectangulo=lrectangulo;

  }
  //metodos
  public void  getltriangulo(){
      System.out.println("La figura tiene "+ltriangulo + "lados"); 
  }
 
  
   public void  getlrectangulo(){
     System.out.println("La figura tiene "+lrectangulo + " lados");   
   }
}
