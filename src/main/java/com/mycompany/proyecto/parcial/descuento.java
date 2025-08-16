package com.mycompany.proyecto.parcial;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class descuento {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double p, d, t;
        System.out.println("ingrese el costo de los medicamentos");
        p=lector.nextDouble();
        d=p*0.1;
        t=p-d;
        System.out.println("el descuento es de "+d);
        System.out.println("el precio final es de "+t);
    }
}
