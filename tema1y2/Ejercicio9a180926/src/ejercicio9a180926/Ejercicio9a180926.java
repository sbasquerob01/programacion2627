/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9a180926;

/**
 *
 * @author alumno
 */
public class Ejercicio9a180926 {

    final static double PI = 3.1415; //declaración de constantes y asignación
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio = 3.55, longitud; //declaración y asignación de variables
        
        longitud = radio * 2 * PI; //formula del area de una circunferencia
        
        System.out.print("La longitud de una circunferencia cuyo radio vale " + radio + " seria igual a: " + longitud + " metros."); //mostramos el resultado
    }
    
}
