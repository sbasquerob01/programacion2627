/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejercicio14a231026;
import java.util.Scanner; //importamos scanner
/**
 *
 * @author alumno
 */
public class T4Ejercicio14a231026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean state; //declaramos el estado (mayor de 1 o no)
        int num; //el numero introducido
        do {
            num = recogerNum(); //numero saldrá de recoger numero
            state = comprobarMayor0(num); //estado vendrá de comprobar con comprobarMayor1 el numero introducido por el usuario
            if (state == false){ //si el estado es falso (menor o igual a 1) se mostrará un mensaje de error
                System.out.println("Error, introduce un numero mayor a 0");
            }
        } while (state == false); //se ejecutará hasta que el estado sea true y por lo tanto, el numero sea mayor a 1
        
        contar(num); //hasta que el estado no esté en true, no se podrá llegar a contar hasta el numero que el usuario introdujo
    }
    public static int recogerNum(){
        int num; //declaramos variable y scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero mayor que 0: "); //pedimos el numero
        num = entrada.nextInt();
        
        return num; //devolvemos el numero
    }
    
    public static boolean comprobarMayor0(int num){
        boolean valido; //declaramos el boolean
        if (num > 0){ //si el numero es menor o igual a 1 no será valido
            valido = true;
        }
        else {
            valido = false;
        }
        return valido; //devolvemos valido
    }
    
    public static void contar(int num){
        int contador = 0;
        for (int i=0;i<=num;i=i+3){ //hasta que i no sea igual que num
            System.out.println(i); //no parará de printear numeros
            contador++; //el contador aumenta con cada pasada
        }
        System.out.println("Se han impreso: " + (contador - 1) + " multiplos de 3."); 
        //^mostramos el contador al final y le restamos el primer numero (0) para que muestre el numero total de multiplos mostrados
    }
    
}
