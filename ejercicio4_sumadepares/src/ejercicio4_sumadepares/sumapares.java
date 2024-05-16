
package ejercicio4_sumadepares;


public class sumapares {
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
