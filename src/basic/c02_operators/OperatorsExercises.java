package basic.c02_operators;

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 5 + 2;
        System.out.println(suma);
        double resta = 2.5 - 0.5;
        System.out.println(resta);
        int multiplicacion = 5 * 2;
        System.out.println(multiplicacion);
        double division = 5.0 / 2;
        System.out.println(division);
        int modulo = 6 % 3;
        System.out.println(modulo);

        // 2. Crea una variable para cada tipo de operación de asignación.
        var a = 1;
        var b = 2;
        a=b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=2;
        System.out.println(a);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        a = 2;
        b = 1;
        System.out.println(a > b);
        System.out.println(a != b);
        System.out.println(b < a);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(b > a);
        System.out.println(b >= a);
        System.out.println(a < b);
        // 5. Utiliza el operador lógico and.
        System.out.println(a > b && b != 0);
        // 6. Utiliza el operador lógico or.
        System.out.println(b > a || b >= 0);
        // 7. Combina ambos operadores lógicos.
        System.out.println(a < b && b == 0 || a > 0);
        // 8. Añade alguna negación.
        System.out.println(b > a || !(b == 0));
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(-b);
        System.out.println(--b);
        System.out.println(b++);
        System.out.println(b);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(a + b >= 3 && b <= 2);
    }
}
