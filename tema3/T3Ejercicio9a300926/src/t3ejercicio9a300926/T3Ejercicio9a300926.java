/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ejercicio9a300926;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ejercicio9a300926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3,num4,auxiliar; //declaracion de variables y scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce el cuarto numero: ");
        num4 = entrada.nextInt();
        //primera pasada
        //comparamos num1 y num2
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        
        //comparamos num2 y num3
        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;
        }
        
        //comparamos num3 y num4
        if (num3 > num4) {
            auxiliar = num3;
            num3 = num4;
            num4 = auxiliar;
        }

        //segunda pasada
        //comparamos num1 y num2
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        //comparamos num2 y num3
        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;
        }

        //tercera pasada
        //comparamos num1 y num2
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }

        //mostramos el resultado ya ordenado
        System.out.println("Numeros ordenados: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
    
}
