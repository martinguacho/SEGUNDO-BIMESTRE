
package taller.en.clase;

import java.util.Scanner;

public class TallerEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
         // Declaracion de variables
        int[] lista1, lista2, lista3;
        int n, temp, j = 0, k = 0,i = 0,jsum = 0, ksum = 0, isum=0;
        
        // Creacion de listas
        System.out.print("Ingrese el numero de datos a ingresar: ");
        n = taller.nextInt();
        temp = n - (int)(n/2)+1;
        lista1 = new int[n+1];
        lista2 = new int[(int)(n/2)+2];
        lista3 = new int[temp];
        
        for (i = 0; i < lista1.length-1; i++) {
            System.out.print("Ingrese el valor ["+(i+1)+"]: ");
            lista1[i] = taller.nextInt();
            if (i % 2 == 0) {
                lista2[j] = lista1[i];
                jsum += lista2[j];
                j++;
            } else {
                lista3[k] = lista1[i];                
                ksum += lista3[k];
                k++;
            }
            isum += lista1[i];   
        }   
        lista1[i] = isum;
        lista2[j] = jsum;
        lista3[k] = ksum;
        
        // Salida de datos
        //muestra de la lista principal con su suma total
        System.out.println("LISTA PRINCIPAL Y SU SUMA TOTAL\n");
        for (int _i = 0; _i < lista1.length; _i++) {
            System.out.println("Lista 1 ["+(_i + 1)+"] = "+lista1[_i]);
        }
        
        //muestra de la lista resultante del arreglo impar con su suma
        System.out.println("LISTA DE LA SUMA DEL ARREGLO IMPAR\n");
        for (int _j = 0; _j < lista2.length; _j++) {
            System.out.println("Lista 2 ["+(_j + 1)+"] = "+lista2[_j]);
        }
        
        //lista de la lista resultante del arreglo par con su suma
        System.out.println("LISTA DE LA SUMA DEL ARREGLO PAR\n");
        for (int _k = 0; _k < lista3.length; _k++) {
            System.out.println("Lista3 ["+(_k + 1)+"] = "+lista3[_k]);
        }
    }
}