
package herencia;


public class TelefonoMovil extends DispositivosElectronicos {
  private String color;
    
 public TelefonoMovil(String marca,String tipo, String color){
     super(marca,tipo);
      this.color =color;
 }  
  @Override
  public void marcaa(){
     super.marcaa();
      System.out.println("tu dispositivo electronico  es de color "+color);
  }
 
}
