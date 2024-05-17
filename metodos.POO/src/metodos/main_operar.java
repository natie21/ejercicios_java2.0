
package metodos;

import javax.swing.JOptionPane;


public class main_operar {
 public static void main (String [] args ){
   int n1= Integer.parseInt( JOptionPane.showInputDialog("ingresa un numero"));
   int n2= Integer.parseInt( JOptionPane.showInputDialog("ingresa un numero"));
    operaciones_dos operaciones = new operaciones_dos();
  operaciones.sumar(n1, n2);
  operaciones.restar(n1, n2);
  operaciones.multiplicarr(n1, n2);
  operaciones.resultados();
    
 }   
}
