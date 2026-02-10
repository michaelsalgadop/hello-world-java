package basic.c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        printWelcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        printHelloUser("Michael");
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        System.out.println(subtraction(3,1));
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println(squaredNumber(3));
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        System.out.println(evenOdd(14));
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println(isAdult(14));
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        System.out.println(stringSize("Texto de ejemplo"));
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        System.out.println(averageNumbers(new int[]{4,3,7,6,8}));
        // 9. Escribe un método que reciba un número y retorna su factorial.
        System.out.println(factorial(6));
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        printArrayList(new ArrayList<>(Arrays.asList("Hola", "Que", "Tal?")));
    }
    public static void printWelcome () {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }
    public static void printHelloUser (String name) {
        System.out.println("Hola, " + name);
    }
    public static int subtraction (int numberA, int numberB) {
        return numberA - numberB;
    }
    public static int squaredNumber (int number) {
        return number * number;
    }
    public static String evenOdd (int number) {
        return number % 2 == 0 ? "Par" : "Impar";
    }
    public static boolean isAdult (int age) {
        return age >= 18;
    }
    public static int stringSize (String text) {
        return text.length();
    }
    public static double averageNumbers (int[] numbers) {
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        return average / numbers.length;
    }
    public static int factorial (int number) {
        int factorial = 1;
        int index = 1;
        while(index <= number) {
            factorial *= index;
            index ++;
        }
        return factorial;
    }
    public static void printArrayList (ArrayList<String> texts) {
        for (String text : texts) {
            System.out.println(text);
        }
    }
}
