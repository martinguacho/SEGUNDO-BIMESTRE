
package talleres.en.clase;

import java.util.Scanner;

public class TalleresEnClase {

    private static double total;
    public Scanner taller;
    static double iva = 0.12;
    
    //funcion salida de resultados
    public static void main(String[] args) {
        double resultado;   
        resultado = calculoiva(354,iva);
        System.out.println("el calculo del iva es: "+resultado);
    }
    
    //funcion para el calculo del IVA
    public static double calculoiva(double sub, double iva){
        double sub2=0;double total=0;
        sub2 = sub * iva;
        total = sub2 + sub;
        return total;
    }
}
