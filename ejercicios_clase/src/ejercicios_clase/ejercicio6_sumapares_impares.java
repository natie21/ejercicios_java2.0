/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_clase;

/**
 *
 * @author ANTONIO VALDEZ
 */
public class ejercicio6_sumapares_impares {
    public static void ejercicio6_sumapares_impares(){
        int i;
    i=0;
    int suma;
    int sumai;
    sumai=0;
    suma=0;
    while(i < 5){
       i++;
       if(i % 2== 0){
        suma=suma+i;  
        //suma+=i
       }
       else if(i % 2== 1){
         sumai=sumai+i;  
       }
        System.out.println(i);
    }
    System.out.println("la suma de lo numeros pares es ="+suma);
     System.out.println("la suma de lo numeros impares es ="+sumai);
    }
    
}
