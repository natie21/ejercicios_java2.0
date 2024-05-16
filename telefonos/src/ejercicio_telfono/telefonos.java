
package ejercicio_telfono;

import javax.swing.JOptionPane;


public class telefonos {
 String marca;
  String color;
  int almacenamiento;
  
  
  public void marca(){
  marca = JOptionPane.showInputDialog(null, " ingresa la marca del telefono que deseas");
  // JOptionPane.showMessageDialog(null,"La marca es :"+ marca);
  }
  public void color(){
  color = JOptionPane.showInputDialog(null, "ingresa el color del telefono que deseas");
  //JOptionPane.showMessageDialog(null,"El color que ingresaste es:"+color);
      
  }
  public void almacenamiento(){
  almacenamiento = Integer.parseInt(JOptionPane.showInputDialog(null, " ingresa el almacenamiento del telefono "));
    // JOptionPane.showMessageDialog(null,"el almacenamiento es de :"+ almacenamiento);
  }  
  public void resultados (){
     JOptionPane.showMessageDialog(null,"La marca es :"+ marca + "\n" + "El color que ingresaste es:"+color
     + "\n" + "el almacenamiento es de :"+ almacenamiento);  
  }
}
