
package herencia;

public class main_D_E {
 public static void main(String [] args) {
    DispositivosElectronicos dispelectronicos = new DispositivosElectronicos("Samsung","telefono");
    dispelectronicos.marcaa();
    dispelectronicos.tipos();
    
     System.out.println("clase hija");
     TelefonoMovil telefono = new TelefonoMovil("Motorola","celular","Azul");
     telefono.marcaa();
 }  
}
