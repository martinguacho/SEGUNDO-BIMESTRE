
package funciones;

import java.util.Scanner;

public class Funciones {
    private int[][] mat;
    private Scanner entrada;

    public static void main(String[] args) {
     
        Funciones ma = new Funciones();
        ma.llenar();
        ma.imprimir();
        ma.lineainferior();
        ma.diagonalprincipal();
        ma.diagonalsecundaria();
        ma.superiorprincipal();
        ma.inferiorprincipal();
        ma.superiorsecundaria();
        ma.inferiorsecundaria();
        ma.matrizzigzag();
        
    }

    private void llenar() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el limite de la matriz: ");
        int top = entrada.nextInt();
        mat = new int[top][top];
        System.out.println("Llene la matriz: \n");
        
        //llenado de la matriz
        for(int x=0;x<top;x++){
            for(int y=0;y<top;y++){
                System.out.print("Ingrese la matriz["+(x+1)+"]["+(y+1)+"]: ");
                mat[x][y] = entrada.nextInt();
            }
        }
    }

    private void imprimir() {
        System.out.println("Presentacion de la matriz\n");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                System.out.print(mat[x][y]+" ");
            }
            System.out.println(" ");
        }
    }
    
    private void lineainferior() {
        System.out.println("Presentacion de la fila inferior de la matriz");
        for(int y=0;y<mat.length;y++){
            System.out.print(mat[mat.length-1][y]+" ");
        }
    }

    private void diagonalprincipal() {
        System.out.println("\nPresentacion de la diagonal principal de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if(x == y){
                    System.out.print(mat[x][y]+" ");
                }
            }
        }
        
    }

    private void diagonalsecundaria() {
        System.out.println("\nPresentacion de la diagonal secundaria de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if(x + y == mat.length-1){
                    System.out.print(mat[x][y]+" ");
                }
            }
        }
    }

    private void superiorprincipal() {
        System.out.println("\nPresentacion de la parte superior de la diagonal principal de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if(x < y){
                    System.out.print(mat[x][y]+" ");
                }
            }
        }
    }

    private void inferiorprincipal() {
       System.out.println("\nPresentacion de la parte inferior de la diagonal principal de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if(x > y){
                    System.out.print(mat[x][y]+" ");
                }
            }
        }
    }

    private void superiorsecundaria() {
        System.out.println("\nPresentacion de la parte superior de la diagonal secundaria de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if( x+y < mat.length-1){
                    System.out.print(mat[x][y]+" ");
                }
            }
        } 
    }

    private void inferiorsecundaria() {
        System.out.println("\nPresentacion de la parte inferior de la diagonal secundaria de la matriz ");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat.length;y++){
                if( x+y > mat.length-1){
                    System.out.print(mat[x][y]+" ");
                }
            }
        } 
    }

    private void matrizzigzag() {
        System.out.println("\nPresentacion de la matriz en zig-zag ");
       for(int y=0;y<mat.length;y++){
           if(y%2==0){
               for(int x=0;x<mat.length;x++){
                   System.out.print(mat[x][y]+" ");
               }       
           }else{
               for(int x=mat.length-1;x>=0;x--){
                   System.out.print(mat[x][y]+" ");
               }               
           }
       }
    }
    
}
