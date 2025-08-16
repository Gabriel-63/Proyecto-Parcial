package com.mycompany.proyecto.parcial;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ProyectoParcial {

    public static void main(String[] args) {
        double n, p=0;
        int i=1;
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese 10 notas ");
        do{
           n=lector.nextDouble();
           p = p + n;
        i=i+1;
        }while(i<=10);
        n=p/i;
        if(n>7){
            System.out.println("Promocionado");
        }else if (n>=4 & n<=7){
            System.out.println("Regular");
        }else if(n>=1 & n<4){
            System.out.println("Reprobado");
        }else{
            System.out.println("ingrese valores validos");
        }
    }
}
