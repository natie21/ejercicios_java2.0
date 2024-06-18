
package ejerc_retorno;


public class main_retornos {
 public static void main(String [] args) {
     metodos_retorno enviar = new metodos_retorno();
   
     String nom = "Natalie";
    
     System.out.println("el nombre es :"+ enviar.nombre(nom));
     //opcion 1 para validar el numero
    // enviar.positivo_neg(-4);
     //System.out.println("el numero es :"+ enviar.positivo_neg(-4));
       
     
     //opcion2
     int num =-4;
     if(enviar.positivo_neg(num)==1){
         System.out.println("El numero es positivo"  +num);   
     }
     else{
       System.out.println("El numero es negativo"  +num);      
     }
 }  
}
