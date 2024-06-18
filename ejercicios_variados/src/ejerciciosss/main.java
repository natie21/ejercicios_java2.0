/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosss;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
 public static void main (String [] args){
     int i,f;
     int fin,num;
     ejercicios alumno = new ejercicios();
     
     Scanner leer = new Scanner (System.in);
     System.out.println("ingresa un numero que sera el inicio de la secuencia");
     i= leer.nextInt();
     System.out.println("ingresa un numero que sera el fin de la secuencia");
     f= leer.nextInt();
       
     //metodo 1
     alumno.numeros_coclofor(i , f);
     //metodo 2
     System.out.println("ingresa un numero que sera el fin de la secuencia numeros pares");
     fin= leer.nextInt();
     alumno.suma_numeros_pares(fin);
     //metodo 3
   System.out.println("ingresa un numero positivo o negativo");
    num = leer.nextInt();
     
    alumno.numero_positivo_negativo(num);
 }   
 
}
