package basic.c09_exceptions;

import basic.c09_exceptions.classes.login.LoginSystem;
import basic.c09_exceptions.classes.temperature.TemperatureChecker;
import basic.c09_exceptions.exceptions.LoginFailedException;
import basic.c09_exceptions.exceptions.TemperatureException;

public class ExceptionsExercises {
    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        try {
            var number1 = 12;
            var number2 = 0;
            System.out.println(number1 / number2);
        } catch(ArithmeticException e) {
            System.out.println("Error de división: " + e.getMessage()); // Error: / by zero
        }
        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        try {
            int [] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha salido del array: " + e.getMessage());
        }
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Intentando manejar métodos de un string nulo: " + e.getMessage());
        }
        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        try {
            String text = "1hola";
            System.out.println(transform(text));
        } catch (NumberFormatException e) {
            System.out.println("No se ha podido transformar en número: " + e.getMessage());
        }
        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        try {
            String text = "12trtegf";
            System.out.println(transform(text));
        } catch (NumberFormatException e) {
            System.out.println("No se ha podido transformar en número: " + e.getMessage());
        } finally {
            System.out.println("Siempre salgo!");
        }
        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        try {
            var number =  -1;
            if (number < 0) {
                throw new IllegalArgumentException("Número negativo");
            }
            System.out.println(number);
        } catch (IllegalArgumentException e) {
            System.out.println("Número introducido incorrecto: " + e.getMessage());
        }
        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        try {
            var temperature = new TemperatureChecker();
            temperature.checkTemperature(-100);
        } catch (TemperatureException e) {
            System.out.println("Número introducido incorrecto: " + e.getMessage());
        }
        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        try {
            var result = 10 / 1;
            System.out.println(result);
            int [] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("División incorrecta: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se salió del array: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        try {
            checkPassword("12345");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseña introducida: " + e.getMessage());
        }
        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        try {
            var loginSystem = new LoginSystem();
            loginSystem.checkUser("hola","hola");
        } catch (LoginFailedException e) {
            System.out.println("Error introduciendo el usuario: " + e.getMessage());
        }
    }
    public static int transform (String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }
    public static void checkPassword (String pass) throws IllegalArgumentException {
        if (pass.length() < 4) {
            throw new IllegalArgumentException("Contraseña muy corta!");
        } else {
            System.out.println("Contraseña válida");
        }
    }
}
