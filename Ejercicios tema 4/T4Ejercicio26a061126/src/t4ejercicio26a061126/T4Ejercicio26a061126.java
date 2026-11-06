/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejercicio26a061126;
import java.util.Scanner; //importamos scanner
/**
 *
 * @author alumno
 */
public class T4Ejercicio26a061126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pedimos el numero
        int num;
        
        System.out.println("Introduce tu numero: ");
        num = entrada.nextInt();
        
        comprobarPrimo(num); //comprobamos el numero
    }
    public static void comprobarPrimo(int num){
        boolean primo = true;
        int i = 3;
        int limite = num/2;
        
        if (num <= 1){ //si es menor que 1 no es primo
            primo = false;
        }
        if (num % 2 == 0){ // si es divisible entre 2 no es primo
            primo = false;
        }
        while (primo == true && i<=limite) { //si no es divisible entre los numeros impares hasta la mitad del numero entonces es primo
            if (num % i == 0){
                primo = false;
            }
            else {
                i = i + 2;
            }
        }
        if (num == 2){ // si es 2 es primo
            primo = true;
        }
        
        if (primo == true) { // muestra el resultado
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
}
