
package ejemplos;


public class Principal {
    public static void main(String[] args) {
        Coche micoche=new Coche();
        
        //usar metodos de la iterfaz creada
        micoche.arrancar();
        System.out.println("La velocidad actual del auto es de "+micoche.ObtenerVelocidad() +"Km/hr");
        micoche.detener();
        
        System.out.println("La velocidad final del auto es de : "+micoche.ObtenerVelocidad()+"Km/hr");
    }
    
}
