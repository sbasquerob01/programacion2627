/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ejercicio16a021026;

/**
 *
 * @author alumno
 */
public class T3Ejercicio16a021026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 20,contador = 0; //declaracion y asignacion de la variable
        while (numero <= 160) { //hasta que el numero no sea 160 repite:
            if (numero % 2 == 1){ //aquellos numeros cuyo modulo de 2 sea 1 se printean
                System.out.println(numero + " es un numero impar");
                contador ++;
            }
            numero ++; //se incrementa el valor de numero    
    }
        System.out.println("La cantidad de numeros impares entre 20 y 160 es de: " + contador);
}
}
