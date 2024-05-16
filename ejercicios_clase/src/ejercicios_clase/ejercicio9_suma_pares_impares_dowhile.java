
package ejercicios_clase;


public class ejercicio9_suma_pares_impares_dowhile {
    public static void ejercicio9_suma_pares_impares_dowhile (){
        int i ;
        i=1;
        int sumap,sumai,sumafinal;
        sumap=0;
        sumai=0;
        sumafinal=0;
        do{
            if(i % 2 ==0){
             sumap=sumap+i;   
            }
            else if(i % 2 ==1){
             sumai=sumai +i;   
            }
    
            i++;
            
        }while (i <=6);
        sumafinal=(sumap+sumai)+2;
        System.out.println("la suma de los pares es ="+sumap);
        System.out.println("la suma de los impares es ="+sumai);
        System.out.println("la suma total + 2 es ="+sumafinal);
    }
}
