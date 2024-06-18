
package ejerc_retorno;


public class metodos_retorno {
  
    
  public String nombre (String nombree){
     
    return nombree;  
  }
  public int positivo_neg(int num){
      int positivo=0;
     if(num > 0){
     positivo = positivo+1;
         System.out.println("el numero es positivo");
     } 
     else if(num < 0){
     positivo = positivo-1; 
      System.out.println("el numero es negativo");
     }
     return positivo;
  }
}
