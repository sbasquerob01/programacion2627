/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ejercicio29a141026;
import java.util.Scanner; //importamos los paquetes necesarios
/**
 *
 * @author alumno
 */
public class T3Ejercicio29a141026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, contador = 0, resolver; //declaramos variables y escanner
        Scanner entrada = new Scanner(System.in);
        
        resolver = (int) (Math.random()*100)+1; //hacemos que resolver sea un numero random entre 1 y 100
        do {
        System.out.println("Introduce tu numero entre 1 y 100: "); 
        num = entrada.nextInt();  //recogemos el numero del usuario
        contador++; //hacemos que contador suba con cada intento
        
        if (num == resolver){ //si acierta
            System.out.println("Enhorabuena, has acertado");
        }
        else if (num < resolver) { //si su numero es menor
            System.out.println("Numero equivocado, esta por arriba");
        }
        else {  //si su numero es mayor
            System.out.println("Numero equivocado, esta por debajo");
        }
        } while (num != resolver); //repetimos esto mientras el numero no sea igual al que hay que acertar
        
        System.out.println("El numero de intentos es: " + contador); //fuera del bucle, cuando acierte, mostramos los intentos
    }
    
}
