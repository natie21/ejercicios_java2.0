
package ModificadoresDeAcceso;


public class clase1 {
  public int a=1; 
  protected int b =2;
  int c =3;
  private int d =4;
  private int edad =24;
  public void metodoclase1(){
      System.out.println("Desde la misma clase"); 
      System.out.println("a= "+a);
      System.out.println("b= "+b);
      System.out.println("c= "+c);
      System.out.println("d= "+d);
  }
  
  public int getEdad(){
    return edad;  
  }
  public void setEdad (int edad){
     if(edad>0 && edad <90){
       this.edad=edad;  
     }
  }
}
