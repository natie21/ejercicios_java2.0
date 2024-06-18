
package conversion_decimal;

import java.text.DecimalFormat;


public class ejemp {
    public static void main(String[] args) {
        double num= 2.85413408765;
        //crear DecimalFormat df y especificar
    DecimalFormat df= new DecimalFormat("#.##");
    //formatear el valor
    String valorFormateado= df.format(num);
    double v = Math.round(num);//lo redondea a un entero
    //imprimir en pntalla 
        System.out.println("Valor original : "+num);
        System.out.println("Valor modificado : "+valorFormateado);
        System.out.println("usando libreria Math : "+v);
    }
  
}
