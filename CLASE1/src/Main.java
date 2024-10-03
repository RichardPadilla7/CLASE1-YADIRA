//Richard Padilla
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
/*
        // Imprimir un mensaje en pantalla
        System.out.print("¡Hola mundo!");

        // Imprimir una línea en blanco
        System.out.println("\n");

        // Imprimir un mensaje con salto de linea
        System.out.println("A.- La ciencia es la clave para descubrir los secretos del universo: uniendo a la humanidad con cada descubrimiento, expandiendo nuestro conocimiento y despertando nuestra imaginación. ");
        System.out.println("B.- Al navegar por las arenas del tiempo y el espacio, la ciencia da contexto y significado a mediciones grandes y pequeñas. ");
        System.out.println("C.- ¿Sabías que existen tantas estrellas en el universo como hay granos de arena en la Tierra?");
*/

//EJERCICIO 2
        /*
        int edad = 22;
        double altura = 1.70;
        double peso = 68.5;
        char sexo = 'H';
        boolean Ecuatoriano = true;
        String nombre = "Richard";
        double Resultado = (peso/altura*2);

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Es Ecuatoriano: " + Ecuatoriano);
        System.out.println("Su IMC es: " + Math.round(Resultado));
*/

        //EJERCICIO 3
        /*
        int var1 = 2;
        int var2 = 5;
        int var3 = 7;
        int var4 = 8;

        int multiplicacion = (var1 * var4);
        int resta = (var2 - var3);
        int total = (multiplicacion * resta);

        System.out.println("La multiplicación de var1 y var4 es: " + multiplicacion);
        System.out.println("La resta de var2 y var3 es: " + resta);
        System.out.println("El resultado de la multiplicación por la resta es: " + total);
        */


        //EJERCICIO 4
        Scanner input = new Scanner(System.in);

        String usergame;
        int juegos;
        double MB_juego;

        System.out.println("¿Cual es tu nombre de juegos?");
        usergame = input.nextLine();
        System.out.println("¿Cuantos juegos comprados tienes?");
        juegos = input.nextInt();
        System.out.println("¿Cuantos Megabytes pesa tu juego favorito?");
        MB_juego = input.nextDouble();


    }

}