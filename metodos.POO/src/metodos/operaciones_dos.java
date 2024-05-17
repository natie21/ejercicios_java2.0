
package metodos;


public class operaciones_dos {
     int suma;
   int resta;
   int multiplicacion;
   
   
    public void sumar(int num, int num2){
       suma = num+num2;
      
    }
     public void restar(int num, int num2){
       resta = num-num2;
      
    }
     public void multiplicarr(int num, int num2){
   multiplicacion = num*num2;
      
    }
     // un metodo que contenga los resultados
     public void resultados(){
         System.out.println("la suma es :"+suma);
         System.out.println("la multiplicacion es:"+multiplicacion);   
          System.out.println("la resta es:"+resta);
     }
}
