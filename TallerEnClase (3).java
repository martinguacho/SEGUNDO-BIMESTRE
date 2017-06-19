
package taller.en.clase;

import java.util.Scanner;

public class TallerEnClase {

    public static void main(String[] args) {
        Scanner taller = new Scanner (System.in);
        
        //declaracion de variables
        int cedula, i = 0, n, num, num2, s = 0;
        int[] N = new int[10];
        
        //peticion de datos al usuario
        System.out.print("Ingrese su número de cédula: ");
        cedula = taller.nextInt();
        
        //ciclo while
        while(i<=9){
            n = cedula%10;
            N[i]= n;            
            cedula = (cedula - n)/10;
            i++;
        }
        i=0;
        while(i<10){
            if(i%2==0){
                s = s + N[i];
            }else{
                num = N[i]*2;
                if(num > 10){
                    num2 = num%10;                         
                    num = (num - num2)/10;
                    num = num + num2;
                }
                if(num == 10){                        
                        num = 1;
                    }
                s = s + num;
            }
            i++;
        } 
        
        //salida de datos al usuario
        if(s % 10 == 0){
            System.out.println("Su número de cédula es válido");
        }else{
            System.out.println("Su número de cédula no es válido");
        }   
    }
}
