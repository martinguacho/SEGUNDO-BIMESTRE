
package trabajos.en.clase;

import java.util.Scanner;

public class TrabajosEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
        //declaracion de variables
        int[][] matriz;
        System.out.println("Ingrese el límite de la  matriz :");
        int top = taller.nextInt();
        matriz = new int[top][top];
        
        System.out.print("Llene la matriz: \n");
        
        //peticion de datos al usuario
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                System.out.print("Ingrese la matriz["+(x+1)+"]["+(y+1)+"]: ");
                matriz[x][y] = taller.nextInt();
                
            }
        }
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println(" ");
        }
        
        //presentacion de la fila inferior
        System.out.println("Presentacion de la fila inferior de la matriz");
        for(int y=0;y<top;y++){
            System.out.print(matriz[top-1][y]+" ");
        }
        
        //presentacion de l diagonal principal
        System.out.println("\nPresentacion de la diagonal principal de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if(x == y){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        }
        
        //presentacion de la diagonal secundaria
        System.out.println("\nPresentacion de la diagonal secundaria de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if(x + y == top-1){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        }
        
        //presentacion de la parte superior de la diagonal principal
        System.out.println("\nPresentacion de la parte superior de la diagonal principal de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if(x < y){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        }
        
        //presentacion de la parte inferior de la diagonal principal
        System.out.println("\nPresentacion de la parte inferior de la diagonal principal de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if(x > y){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        }
        
        //presentacion de la parte superior de la diagonal secundaria
        System.out.println("\nPresentacion de la parte superior de la diagonal secundaria de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if( x+y < top-1){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        } 
        
        //presentacion de la parte superior de la diagonal secundaria
        System.out.println("\nPresentacion de la parte inferior de la diagonal secundaria de la matriz ");
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                if( x+y > top-1){
                    System.out.print(matriz[x][y]+" ");
                }
            }
        } 
        
        //presentacion de la matriz en zig-zag
        System.out.println("\nPresentacion de la matriz en zig-zag ");
       for(int y=0;y<top;y++){
           if(y%2==0){
               for(int x=0;x<top;x++){
                   System.out.print(matriz[x][y]+" ");
               }       
           }else{
               for(int x=top-1;x>=0;x--){
                   System.out.print(matriz[x][y]+" ");
               }               
           }
       }
    }   
}
