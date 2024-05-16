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
public class ejercicio4_sumade_pares {
    public static void  sumapares(){
    int i;
    i=0;
    int suma;
    suma=0;
    while(i < 5){
       i++;
       if(i % 2== 0){
        suma=suma+i;   
       }
        System.out.println(i);
    }
    System.out.println("la suma de lo numeros pares es ="+suma);
}   
}
