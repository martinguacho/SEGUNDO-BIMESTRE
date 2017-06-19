
package taller.en.clase;

import java.util.Scanner;

public class TallerEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
        //declaracion de variables
        int[] lista;
        int top, suma=0, mayor = 0;
        double promedio = 0;
        
        //peticion de datos al usuario
        System.out.print("Ingrese el limite de la lista: ");
        top = taller.nextInt();
        lista = new int[top];
        
        //recorrido de la lista 
        for(int i=0; i<lista.length;i++){
            System.out.print("Ingrese el numero de la lista ["+(i+1)+"]: ");
            lista[i] = taller.nextInt();
            suma = suma + lista[i];
            
            //calculo del numero mayor
            if (lista[i]> mayor){
                mayor = lista[i];
            }
        }
        
        //calculo del promedio
        promedio = (double) suma / top;
        
        //salida de resultados al usuario
        System.out.println("El numero mayor de la lista es: "+mayor);
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);
    } 
}
    
    

