
package ejerciciosss;


public class ejercicios {
    public void numeros_coclofor(int in, int fi){
        int i;
        for(i = in; i<= fi; i++){
            System.out.println(i);   
        }
        
    }
    public void suma_numeros_pares(int n){
        int i=0;
        int suma=0;
        while( i <= n){
            i++;
            if (i % 2 ==0){
             suma=suma+i;   
            }
        }
        System.out.println("La suma de los numeros pares es :"+ suma);
    }
    public void numero_positivo_negativo(int num){
      if(num >= 0 ){
          System.out.println("El numero ingresado es positivo");
      }  
      else{
          System.out.println("el numero es negativo"); 
    }
    }
}
