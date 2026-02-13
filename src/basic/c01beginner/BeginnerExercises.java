package basic.c01beginner;

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Michael";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 26;
        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.64;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustaProgramar = true;
        // 5. Declara una constante con tu email.
        final String EMAIL = "michaelsalgadop11@outlook.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'M';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Barcelona";
        System.out.println(localidad);
        localidad = "Granollers";
        System.out.println(localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 2;
        System.out.println(a + b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object)edad).getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String frase;
        frase = "Hola que tal?";
        System.out.println(frase);
    }
}
