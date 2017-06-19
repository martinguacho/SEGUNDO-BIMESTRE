
package taller.en.clase;

import java.util.Scanner;

public class TallerEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
        //declaracion de variables
        int[] lista;
        int top;
        
        //peticion de datos al usuario
        System.out.print("Ingrese el limite de la lista: ");
        top = taller.nextInt();
        lista = new int[top];
        
        //recorrido de la lista
        for(int i=0; i<lista.length;i++){
            System.out.print("Ingrese el numero de la lista ["+(i+1)+"]: ");
            lista[i] = taller.nextInt();
            
            //determinacion si es par o impar y salida de resultados al usuario
            if (lista[i]%2==0){
                System.out.println("El numero de la lista es par");
            }else{
                System.out.println("El numero de la lista es impar");
            }   
        }   
    }  
}
