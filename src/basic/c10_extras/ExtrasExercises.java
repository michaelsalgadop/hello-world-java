package basic.c10_extras;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExtrasExercises {
    static String message = "Hola global";
    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String text = null;
        if (text != null && !text.isEmpty()){
            System.out.println(text);
        }
        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        var scanner = new Scanner(System.in);
        try {
            System.out.println("Escribe tu nombre:");
            var name = scanner.nextLine();
            if (checkString(name)) {
                throw new IllegalArgumentException("No se pueden introducir números en el nombre");
            }
            System.out.println("Escribe tu edad:");
            var age = scanner.nextInt();
            System.out.println("Tu nombre: " + name + " tu edad: " + age);
        } catch (IllegalArgumentException e) {
            System.err.println("Nombre mal escrito: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error al introducir la edad: " + e.getMessage());
        }

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);
        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String message = "Hola local";
        System.out.println(message);
        showMessage();
        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        try {
            System.out.println("Escribe un número:");
            var number = scanner.nextInt();
            System.out.println(number >= 0 ? "Número positivo" : "Número negativo");
        } catch (InputMismatchException e) {
            System.err.println("Error al escribir el número: " + e.getMessage());
        }
        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println(Extras.number);
        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        Random rand = new Random();
        System.out.println(rand.nextInt(10) + 1);
        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        printUser();
        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
    }
    public static boolean checkString (String text) {
        return text == null || text.matches(".*\\d.*");
    }
    public static void showMessage() {
        System.out.println(message);
    }
    public static void printUser () {
        var user = new User();
        System.out.println(user.APP_NAME + " nombre de usuario: " + User.username);
    }
}
