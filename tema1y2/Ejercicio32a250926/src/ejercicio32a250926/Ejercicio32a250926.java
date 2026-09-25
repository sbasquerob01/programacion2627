/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32a250926;
import java.util.Scanner; //importamos scanner
/**
 *
 * @author alumno
 */
public class Ejercicio32a250926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dinero, dineroinicial, b50, b20, b10, b5, m2; //declaración de variables
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de dinero que buscas calcular: "); //Pedimos al usuario la cantidad de dinero que busca con entrada.nextInt()
        dinero = entrada.nextInt();
        
        dineroinicial = dinero;
        
        b50 = dinero / 50; //aquí calculamos los billetes de 50 y actualizamos la variable del dinero para tener cuanto nos queda
        dinero = dinero % 50;
        
        b20 = dinero / 20; //aquí calculamos los billetes de 20 y actualizamos la variable del dinero para tener cuanto nos queda
        dinero = dinero % 20;
        
        b10 = dinero / 10; //aquí calculamos los billetes de 10 y actualizamos la variable del dinero para tener cuanto nos queda
        dinero = dinero % 10;
        
        b5 = dinero / 5; //aquí calculamos los billetes de 5 y actualizamos la variable del dinero para tener cuanto nos queda
        dinero = dinero % 5;
        
        m2 = dinero / 2; //aquí calculamos los billetes de 2 y actualizamos la variable del dinero para tener cuanto nos queda
        dinero = dinero % 2;
        
        //no hace falta que almacenemos el dinero en monedas de 1 ya que ya hemos repartido hasta la unidad más baja, por lo tanto, solo puede quedarnos o no 1 moneda de 1 €
        
        System.out.println(dineroinicial + " euros hacen un total de: " + b50 + " billetes de 50 euros, " + b20 + " billetes de 20 euros, " + b10 + " billetes de 10 euros, " + b5 + " billetes de 5 euros, " + m2 + " monedas de 2 euros y " + dinero + " monedas de 1 euro."); //mostramos el resultado
    }
    
}
