/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejercicio17a281026;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ejercicio17a281026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char secreta = generaLetraAleatoria(); //declaración de variables y equivalencias
        char intento;
        int intentos = 0;
        boolean acertada = false;

        System.out.println("Letra aleatoria minuscula entre la a y la z. Intenta acertar cual es:");

        while (acertada == false) { //mientras no haya acertado, le pediremos la letra, sumaremos un intento por letra y comprobaremos si acertó
            intento = pedirLetra();
            intentos++;
            acertada = comprobarLetra(intento, secreta);
        }

        mostrarResultado(secreta, intentos); //si sale del bucle es porque acertó, asi que mostramos el resultado
    }
    public static char generaLetraAleatoria() {
        return (char) (Math.random() * 26 + 97); //genera un numero aleatorio entre 0 y 26 al que luego le añadimos 97
    }

    public static char pedirLetra() {
        Scanner entrada = new Scanner(System.in); //scanner
        char letra;  //letra
        String texto; //letra introducida por el usuario

        do {
            System.out.print("Introduzca una letra minuscula (a-z): "); //pedimos la letra
            texto = entrada.nextLine();

            if (texto.length() > 0) { //comprobamos la longitud del texto introducido para que el usuario no pulse unicamente el enter
                letra = texto.charAt(0);
            } else {
                letra = ' '; //si solo pulsa el enter lo daremos por no valido
            }

            if (letra < 97 || letra > 122) { //comprobamos que la letra esté entre los valores que buscamos
                System.out.println("Error: introduce una letra minuscula entre a y z.");
            }
        } while (letra < 97 || letra > 122); //preguntaremos hasta que la letra sea valida

        return letra; //devolvemos letra
    }

    public static boolean comprobarLetra(char intento, char secreta) {
        if (intento == secreta) { //si se acierta devolvemos true
            return true;
        } else if (intento < secreta) {
            System.out.println("La letra está despues de la " + intento + " en el alfabeto."); //si es menor, la letra está mas adelante
        } else {
            System.out.println("La letra está antes de la " + intento + " en el alfabeto."); //si es menor, la letra está mas atras
        }
        return false;
    }

    public static void mostrarResultado(char secreta, int intentos) { //recoge tanto secreta como intentos
        System.out.println("Enhorabuena, has acertado; la letra era la " + secreta); //mostramos la letra
        System.out.println("Has necesitado " + intentos + " intentos"); //y los intentos
    }
}
