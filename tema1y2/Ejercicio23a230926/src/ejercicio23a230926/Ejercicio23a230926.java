/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23a230926;
import java.util.Scanner; //importamos la utilidad scanner
/**
 *
 * @author alumno
 */
public class Ejercicio23a230926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //declaramos la clase con scanner
        float precioporunidad, preciofinal; //declaramos variables
        int unidades;
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        
        precioporunidad = entrada.nextFloat(); //pedimos el precio unitario del ordenador 
        
        System.out.println("Por favor, introduzca cuantas unidades desea comprar: ");
        
        unidades = entrada.nextInt(); //reutilizamos entrada.next...() para la cantidad de unidades que buscamos
        
        preciofinal = precioporunidad * unidades; //hacemos el calculo del precio final
        
        System.out.println("El precio final de su compra sera de: " + preciofinal + " euros."); //mostramos el resultado
    }
    
}
