
package ejercicios_clase;


public class ejercicio14_suma_arreglo {
public static void ejercicio14_suma_arreglo(){
   // int suma=0;
    
   // int[] arreglo= {3,45,3,8};
    //for(int i = 0 ; i < arreglo.length ; i++){
     //   System.out.println(arreglo[i]);  
     //   suma= suma+arreglo[i];
  //  }
   // System.out.println("la suma total del arreglo es :"+suma);
   int[] arreglo = {3,45,3,8};

       int numero = 8;
       
       int checador = 1;
       
        for(int i = 0; i < arreglo.length; i++){
           if(arreglo[i]== numero){
               checador=checador -1;
              // System.out.println("El numero si exite");
           }
           else{
               checador=checador +1;
             //  System.out.println("El numero no existe");
           }
           if(checador==0){
               System.out.println("el numero si existe en el arreglo");   
           }
        }
}    
}
