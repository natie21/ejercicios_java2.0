
package ejercicios_clase;

import javax.swing.JOptionPane;


public class ejercicio13_JOption {
 public static void mostrarcuadrodedialogo(){
     //mostrar mensaje
    // JOptionPane.showMessageDialog(null,"hola mundoo");
    //resta de numeros
    int n1,n2;
   // String pedirnum = JOptionPane.showInputDialog("Ingresa un numero");
   //n1= Integer.parseInt(pedirnum);
   //String pedirnumero = JOptionPane.showInputDialog("Ingresa un segundo numero");
   //n2 = Integer.parseInt(pedirnumero);
   //int resta =n1-n2;
   //JOptionPane.showMessageDialog(null,"la resta de los numeros es :" +resta);
   //multiplicacion de numeros
   String leernum = JOptionPane.showInputDialog("Ingresa el primer numero");
   n1= Integer.parseInt(leernum);
   String leernum2= JOptionPane.showInputDialog("ingresa el segundo numero");
   n2= Integer.parseInt(leernum2);
    int multiplicacion=n1*n2;
    JOptionPane.showMessageDialog(null, "la multipliacion es:"+multiplicacion);
    
   // JOptionPane.showInternalMessageDialog("advertencia tienes un error", leernum, leernum, n2);
 }   
}
