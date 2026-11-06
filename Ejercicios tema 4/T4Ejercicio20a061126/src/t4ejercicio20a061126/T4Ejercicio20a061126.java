/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ejercicio20a061126;
import java.util.Scanner; //importamos scanner
/**
 *
 * @author alumno
 */
public class T4Ejercicio20a061126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta1, respuesta2; //dcclaracion de variables
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.print("1 PREGUNTA: ¿Cuál es la capital de España?: ");
        respuesta1 = pedirRespuesta();
        System.out.print("2 PREGUNTA: ¿Quién descubrió América?: ");
        respuesta2 = pedirRespuesta();
        
        mostrarResultados(comprobarRespuestas(respuesta1,respuesta2));
    }
    public static String pedirRespuesta() { //simplemente uso un scanner para recoger lo que el usuario introduzca y lo devuelvo con return
        Scanner entrada = new Scanner(System.in);
        
        String respuesta = entrada.nextLine();
        
        return respuesta;
    }
    public static int comprobarRespuestas (String respuesta1,String respuesta2){ //con switches compruebo la respuesta de la pregunta 1 y la pregunta 2
        int nota = 0; //aqui almaceno la nota obtenida (inicialmente es 0 y si se acierta una pregunta se suma 5 puntos)
        switch (respuesta1) {
            case "Madrid": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            case "madrid": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            default:{
                System.out.println("No es correcto. La respuesta correcta era: Madrid"); //cualquier otra respuesta que no sea la correcta es erronea
            }
        }
        switch (respuesta2) {
            case "colon": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            case "Colon": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            case "colón": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            case "Colón": {
                nota = nota + 5;
                System.out.println("Muy bien, respuesta correcta");
                break;
            }
            default: {
                System.out.println("No es correcto. La respuesta correcta era: Colón"); //cualquier otra respuesta que no sea la correcta es erronea
            }
        }
        return nota;
    }
    public static void mostrarResultados(int nota){ //este metodo simplemente recibe la nota y la imprime por pantalla
        System.out.println("Nota del examen: " + nota);
    }
}
