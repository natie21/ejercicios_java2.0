
package ejemplo2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo2 extends JFrame{
   //definir un bjeto JLabel para definir una etiqueta
    
    private JLabel label1;
    
    //craear un constructor para `posicioar
    
   public  Ejemplo2 (){
       //Layout absoluto
       setLayout(null);
       //tamaño de la ventana
       setBounds(10,10,400,300);
       //titulo
       setTitle("Mi primer JFrame");
       //que no sea redimensionable,cambiar su tamaño
       setResizable(false);
       //cerrar el proceso al cerrar la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       //Crear un onjeto de la clae JLabel y mandarle coo argumentp el text que mostrara
       //instancias construc
       label1=new JLabel("hola mundo");
       //ubicar el JLabel
       label1.setBounds(10, 20, 200, 30);
       add(label1);
       //,mostrar JFrame
       setVisible(true);
   }
}
