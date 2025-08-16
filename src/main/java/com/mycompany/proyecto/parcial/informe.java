package com.mycompany.proyecto.parcial;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class informe {
     public static void main(String[] args) {
         Scanner lector=new Scanner(System.in);
         String con;
         int n1=0, n2=0;
         double s, s1=0, s2=0, t;
         do{
         System.out.println("ingrese su sueldo ");
         s=lector.nextDouble(); 
            if(s>=100 & s<=300){
                s1=s1+s;
                n1=n1+1;
            }else if(s>300 & s<=500){
                s2=s2+s;
                n2=n2+1;
            }else{
                System.out.println("ingrese un sueldo valido ");
            } 
         System.out.println("desea continuar? S=si ");    
         con=lector.next();
         }while(con.equals('S'));
         System.out.println("cantidad de empleados que cobran entra Q.100 y Q.300 "+n1);
         System.out.println("cantidad de empleados que cobran mas de Q.300 "+n2);
         t=s2+s1;
         System.out.println("La cantidad que paga la empresa en sueldos es de: "+t);
     }
}
