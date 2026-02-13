package basic.c00helloworld;

public class HelloWorldExercises {
     static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        // Imprimo mi nombre
         System.out.println("Michael");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        // Imprimo Hola Mundo en dos líneas.
        /*
        * Explicamos como la clase System, con campo estático público out y el método println,
        * podemos lograr imprimir por terminal "Hola\nMundo" en diferentes líneas.*/
         System.out.println("Hola\nMundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
         System.out.println("26 años, azul y Barcelona.");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
         System.err.println("Esto es un error");
        // 7. Utiliza varios println para imprimir una frase.
         System.out.println("Esto");
         System.out.println("es");
         System.out.println("una");
         System.out.println("frase.");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
         System.out.println("\uD83D\uDE00");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        /* Me sale Main method not found in class basic.c00_helloworld.HelloWorldExercises, please define the main method as:
        public static void main(String[] args)*/
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
         //java: class HelloWorldEx is public, should be declared in a file named HelloWorldEx.java
         //Intenta buscar una clase pública con dicho nombre y no lo encuentra.
    }
}
