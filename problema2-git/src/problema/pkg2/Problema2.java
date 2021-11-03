/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        double A;
        double B;
        double C;
        double D;
        double nTrabajos;
        double nLecciones;
        double nParticipaciones;
        double nExmfinal;
        double nTotal;
        
        String nombre;
        
        
        System.out.println("--Programa para calcular la nota final de un estudiante-- \n");
        System.out.println("Ingresar el nombre del estudiante");
        nombre = leer.next();
        
        //Datos
        System.out.println("Ingrese la nota de los trabajos: ");
        A =leer.nextDouble();
        if (A > 10) {
            System.out.println("!!La nota es sobre 10 puntos!!");
            System.out.println("**Ingrese la nota otra vez**");
            System.out.println("");
        }
        System.out.println("-----------------------------------------------");
        
                
        System.out.println("Ingrese la nota de las lecciones: ");
        B =leer.nextDouble();
        if (B > 10) {
            System.out.println("!!La nota es sobre 10 puntos!!");
            System.out.println("**Ingrese la nota otra vez**");
            System.out.println("");
    }
        System.out.println("-----------------------------------------------");
         
        System.out.println("Ingrese la nota de las participaciones: ");
        C =leer.nextDouble();
        if (C > 10) {
            System.out.println("!!La nota es sobre 10 puntos!!");
            System.out.println("**Ingrese la nota otra vez**");
            System.out.println("");
    }
        System.out.println("-----------------------------------------------");
        
        System.out.println("Ingrese la nota del examen final: ");
        D =leer.nextDouble();
        if (D > 10) {
            System.out.println("!!La nota es sobre 10 puntos!!");
            System.out.println("**Ingrese la nota otra vez**");
            System.out.println("");
    }
        System.out.println("-----------------------------------------------");
        
        
        //Proceso
        nTrabajos = A * 20/100;
        nLecciones = B * 30/100;
        nParticipaciones = C * 10/100;
        nExmfinal = D * 40/100;
        nTotal = nTrabajos + nLecciones + nParticipaciones + nExmfinal;
        
        System.out.println( ""+nombre+ " tiene la nota de: " +nTotal+ "\n");
        if (nTotal < 6.99){
        System.out.println("No Aprobado");
        System.out.println("");
        }
        if (nTotal >= 7) {
        if (nTotal <= 10);
        System.out.println("Aprobado");
        }
        
       
        
        
     
    }
    
}
