
package taller.en.clase;

import java.util.Scanner;

public class TallerEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
        //declaracion de variables
         int[] lista;
        int top, menor = 1000;
        
        //peticion de datos al usuario
        System.out.print("Ingrese el limite de la lista: ");
        top = taller.nextInt();
        lista = new int[top];
        
        //recorrido de la lista
        for(int i=0; i<lista.length;i++){
            System.out.print("Ingrese el numero de la lista ["+(i+1)+"]: ");
            lista[i] = taller.nextInt();
            
        //determinando el numero menor
            if (lista[i]< menor){
                menor = lista[i];
            }
        }
        
        //salida de datos al usuario
        System.out.println("El numero menor de la lista es: "+menor);
    }
}
