
package javaapplication53;

import java.util.Scanner;

public class JavaApplication53 {
    
private static double total;
    public static Scanner taller = new Scanner (System.in);
    static double iva = 0.12;
    
    //funcion salida de resultados
    public static void main(String[] args) {
        double resultado, resultado2,resultado3;   
        resultado = calculoiva(354,iva);
        resultado2 = tipopersona();
        resultado3 = descuentopersona(resultado,3);
        System.out.println("El calculo total del IVA es: "+resultado3);
    }
    
    //pregunta si es una persona natural, publica o privada
    public static double tipopersona(){
        System.out.print("Digite (1) si es una persona NATURAL: \nDigite (2) si es una persona PUBLICA: \nDigite (3) si es una persona PRIVADA: ");
        int tipo = taller.nextInt();
        return tipo;
    }
    
    //aplicacion del descuento
    public static double descuentopersona(double total,int tipo){
        double totalt=0;
        if(tipo == 1){
            totalt = total * 0.92;
        }
        if(tipo == 2){
            totalt = total * 0.98;
        }
        if(tipo == 3){
            totalt = total * 0.94;
        }
        return totalt;
    }
    
    //funcion para el calculo del IVA
    public static double calculoiva(double sub, double iva){
        double sub2=0;double total=0;
        sub2 = sub * iva;
        total = sub2 + sub;
        return total;
    }
}

    