package basic.c03strings;

public class StringsExercises {
    public static void main(String[] arg) {
        // 1. Concatena dos cadenas de texto.
        var welcome = "Bienvenido.";
        var question = "En que puedo ayudarte?";
        System.out.println(welcome + " " + question);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud de la cadena: " + welcome.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println("Primer y ultimo carácter de la cadena '" + welcome + "': " + welcome.charAt(0) + " " +
                welcome.charAt(welcome.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("Java, Javascript, Python".contains("Python"));
        // 6. Formatea un string con un entero.
        var ages = 27;
        System.out.println(String.format("Tengo %d años", ages));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        welcome = " Bienvenido. ";
        System.out.println(welcome.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(question.replace(" ","-"));
        // 9. Comprueba si dos strings son iguales.
        var nombre1 = "Manolo";
        var nombre2 = "Manuel";
        System.out.println(nombre1.equals(nombre2));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(nombre1.length() == nombre2.length());
    }

}
