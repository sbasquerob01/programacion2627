/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ejercicio27a091026;
import java.util.Scanner; //importamos los paquetes necesarios

/**
 *
 * @author alumno
 */
public class T3Ejercicio27a091026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu,num1, num2, resultado; //declaramos variables y escanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce numero 1: "); //recogemos numero 1
        num1 = entrada.nextInt();
        
        System.out.println("Introduce numero 2: "); //recogemos numero 2
        num2 = entrada.nextInt();
        
        do {    //mostramos el menu
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            
            menu = entrada.nextInt();
            
            switch (menu) {
            case 1: { //si el numero introducido es 1, hacemos la suma y la mostramos
                resultado = num1 + num2;
                System.out.println("Resultado de la suma es : " + resultado);
                break;
            }
            case 2: { //si el numero introducido es 2, hacemos la resta y la mostramos
                resultado = num1 - num2;
                System.out.println("Resultado de la resta es : " + resultado);
                break;
            }
            case 3: { //si el numero introducido es 3, hacemos la multiplicacion y la mostramos
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicacion es : " + resultado);
                break;
            }
            case 4: { //si el numero introducido es 4, hacemos la division y la mostramos
                try {
                    resultado = num1 / num2; //probamos si da alguna exception
                }catch(ArithmeticException e) { //capturamos la exception y asignamos un nuevo valor a divisior para seguir con el programa
                    System.out.println("Error, no se puede dividir entre 0, seguiendo la ejecucion con divisor = 1");
                } finally {
                    resultado = num1 / 1;
                    System.out.println("Resultado de la division es : " + resultado);
                }
                break;
            }
            }
        } while (menu != 5);
    }
}

