
package ejemplo.poo;

public class coche {
  // atributos / caracteristicas
    String color;
    String marca;
    int km;
    public static void main (String [] args){
       //nombre de la clase _ objeto_constructores
       coche cocheuno= new coche();
       cocheuno.color="azul";
       cocheuno.marca="ford";
       cocheuno.km= 200;
       
        System.out.println("el color del objeto cocheuno es:"+cocheuno.color);
         System.out.println("la marca del objeto cocheuno es:"+cocheuno.marca);
          System.out.println("el kilometraje del objeto cocheuno es:"+cocheuno.km);
    }
    
}
