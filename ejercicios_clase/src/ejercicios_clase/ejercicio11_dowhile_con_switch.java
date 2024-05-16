
package ejercicios_clase;

import java.util.Scanner;


public class ejercicio11_dowhile_con_switch {
 public static void  ejercicio11_dowhile_con_switch(){
     
     
    int op,saldo,retiro,abono;
    saldo=2000;
    Scanner leer = new Scanner (System.in);
    do{
       System.out.println("1; Consultar saldo");  
       System.out.println("2;Retira efectivo");  
        System.out.println("3; Depositar a tu cueenta");  
       System.out.println("4; Salir");  
       op=leer.nextInt();
         
         switch(op){
             
             case 1:
                 
                 System.out.println("Tu saldo actual es de :"+saldo);
             break;
             case 2:
                  System.out.println("INgresa la cantidad que deseas retirar");
                  retiro=leer.nextInt();
                  saldo=saldo-retiro;
                  System.out.println("tu retiro fue exitoso; tu saldo ahoar es de :"+saldo);
             break;
              case 3:
                 System.out.println("¿ que cantidad deseas abonar a tu centa?");
                 abono=leer.nextInt();
                 saldo=saldo+abono;
                 System.out.println("tu abono fue exitoso; tu saldo ahora es de :"+saldo);
             break;
             case 4:
                  System.out.println("EStas saliendo del programa");
             break;
             default:
                 System.out.println("Esa opcion no esta disponible ");
         }
    }while(op !=4);
      
     
     
     
 }
}
