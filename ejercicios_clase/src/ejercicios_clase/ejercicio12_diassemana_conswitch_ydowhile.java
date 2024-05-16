
package ejercicios_clase;

import java.util.Scanner;


public class ejercicio12_diassemana_conswitch_ydowhile {
 public static void    ejercicio12_diassemana_conswitch_ydowhile(){
   int op,saldo,retiro,abono;
    saldo=2000;
    Scanner leer = new Scanner (System.in);
    do{
        System.out.println("!!!!!!!!!!!!!!! MENU DE OPCIONES !!!!!!!!!!!!!!!" ); 
       System.out.println("1; Imprimir dia LUNES" );  
       System.out.println("2;Imprimir dia MARTES");  
       System.out.println("3; Imprimir dia MIERCOLES");  
       System.out.println("4; Imprimir dia JUEVES");  
       System.out.println("5;Imprimir dia VIERNES");  
       System.out.println("6; Imprimir dia SABADO");  
       System.out.println("7; Imprimir dia DOMINGO");  
       System.out.println("8; Salir"); 
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" ); 
       op=leer.nextInt();
         
         switch(op){
             
             case 1:
                 
                 System.out.println("LUNES");
             break;
             case 2:
                  System.out.println("MARTES");
                  
             break;
              case 3:
                 System.out.println("MIERCOLES");
             break;
             case 4:
                  System.out.println("JUEVES");
             break;
              case 5:
                 System.out.println("VIERNES ");
             break;
             case 6:
                  System.out.println("SABADO");
                 
             break;
              case 7:
                 System.out.println("DOMINGO");
                 
             break;
             case 8:
                  System.out.println("EStas saliendo del programa....");
             break;
             default:
                 System.out.println("Esa opcion no esta disponible ");
         }
    }while(op !=8);
        
 }
}
