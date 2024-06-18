
package arreglos;


public class Arregloss {
 
   int []  arreglonum;
   
   public Arregloss(int[] arreglonum){
     this.arreglonum = arreglonum; 
   }
   public int  sumaa(){
       int sumar=0;
       for(int i = 0 ; i < 3;i++ ){
       sumar = sumar+arreglonum[i];     
   }
       return sumar;
}
   public void imprimir (){
       System.out.println("Mostrando elementos del arreglo...");
     for(int i = 0; i< 3 ; i++){
         System.out.println(arreglonum[i]);   
     }  
   }
   public String buscar_num(int numerito){
       for (int num:arreglonum){
         if (num==numerito){
         return  "el numero "+numerito +" fue encontrado";
         }
       }
         return  "el numero no fue encontrado";
         
      
   }
}