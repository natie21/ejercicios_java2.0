
package arreglos;


public class principal {
  // public static void main + tab  
 public static void main (String [] args ){
     int [] arreglo= {1,3,5};
   
     Arregloss array = new Arregloss(arreglo);
     //array.sumaa();
     
     System.out.println("La suma de los elementos del arreglo es :"+array.sumaa());
     
     array.imprimir();
     
  String valor = array.buscar_num(3);
     System.out.println(valor);
     
 }   
}
