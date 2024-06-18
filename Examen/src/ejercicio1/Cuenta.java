
package ejercicio1;

import javax.swing.JOptionPane;


public class Cuenta {
    public static void main(String[] args) {
        Cuenta obj= new Cuenta("Natalie Esoinoza");
        obj.ingresar();
        obj.retirar();
        
    } 
    
 public String Cantidad;
 public String titular;
 
public Cuenta (String titular){
 this.titular= titular;   
}

    public String getTitular() {
        return titular;
    
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getCantidad(){
        return Cantidad;
    }
     
    public void setCantidad(String Cantidad){
        this.Cantidad=Cantidad;
    }


    
    
    public double ingresar (){
      
      Cantidad= JOptionPane.showInputDialog("ingrese la cantidad que desea tener en su cuenta");
        Double.parseDouble(Cantidad);
        //System.out.println(Cant); 
     
     return 0;
        
    }
    

    public double retirar(){
    String retiro ;
    retiro = JOptionPane.showInputDialog("Ingresa la cantidad que desees retirar ");
    Double.parseDouble(retiro);
    Cantidad=Cantidad-retiro;
        System.out.println(Cantidad);
        return 0;
    }
}

