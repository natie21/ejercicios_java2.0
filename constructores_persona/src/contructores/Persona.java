/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructores;


public class Persona {
    // atributos
 String nombre;
 int edad;
 
 // crear metodo contructor
 public Persona (String nombre , int edad){
     // variable local / argumento
     // forma uno : agregar un guion o caracter para diferenciar las locale del argumentos 
    // nombre = nombree;
     //edad = edadd ;
     // 2da forma utilizandos this.
     this.nombre= nombre ;
     this.edad=edad ; 
 }
 public void datosss(){
     System.out.println("el nombre es "+nombre ); 
      System.out.println("la edad es "+edad ); 
 }
}
