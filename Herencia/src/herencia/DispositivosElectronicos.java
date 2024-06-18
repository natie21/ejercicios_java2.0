
package herencia;


public class DispositivosElectronicos {
  //atributos 
  private String marca;
  private String tipo;
  
  //constructores
  public DispositivosElectronicos(String marca,String tipo){
      this.marca=marca;
      this.tipo= tipo;
  } 
    // metodos
    public void marcaa(){
        System.out.println("La marca de tu dispositivo es "+marca);
    }
  public void tipos(){
      System.out.println("tu dispositivo corresponde a un/a "+tipo);  
  }
}
