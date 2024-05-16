/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;


public class operaciones {
   int num;
   int num2;
   int suma;
   int resta;
   int multiplicacion;
   public void leer_nuum(){
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingresa el primer numero");
       num =leer.nextInt();
        System.out.println("Ingresa el segundo numero");
       num2 =leer.nextInt();
   }
    public void sumar(){
       suma = num+num2;
      
    }
     public void restar(){
       resta = num-num2;
      
    }
     public void multiplicarr(){
   multiplicacion = num*num2;
      
    }
     // un metodo que contenga los resultados
     public void resultados(){
         System.out.println("la suma es :"+suma);
         System.out.println("la multiplicacion es:"+multiplicacion);   
          System.out.println("la resta es:"+resta);
     }
        
}
