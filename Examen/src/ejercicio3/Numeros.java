
package ejercicio3;

import java.util.Scanner;

public class Numeros {
 public static void main (String [] args ){
 Scanner leer= new Scanner(System.in);
int num;
int fin = -1;
int contador=0;
do{
  System.out.println("Ingresa los numeros que desees");
  num=leer.nextInt();
 contador++;
}while(num !fin);
 }   
}
