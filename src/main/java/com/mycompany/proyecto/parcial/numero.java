package com.mycompany.proyecto.parcial;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class numero {
    public static void main(String[] args) {
     Scanner lector=new Scanner(System.in);
     double a, b;
     String n, e;
        System.out.println("ingrese un numero ");
        a=lector.nextDouble();
        if (a==1){
            System.out.println("ingrese un nombre");
            n=lector.next();
            System.out.println("ingrese su edad");
            e=lector.next();
            System.out.println("su nombre es: "+n+"su edad es: "+e);
        }else if(a==2){
            System.out.println("ingrese el valor del producto");
            a=lector.nextDouble();
            b=a*0.3;
            System.out.println("el valor es de: "+a+"su descuento es de: "+b);
        }else{
            System.out.println("intente nuevamente");
        } 
    }
}
