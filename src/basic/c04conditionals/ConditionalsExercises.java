package basic.c04conditionals;

public class ConditionalsExercises {
    public static void main(String[] arg) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 18;
        if(age >= 18){
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var numberA = 12;
        var numberB = 10;
        if(numberA > numberB){
            System.out.println(numberA);
        } else if(numberA == numberB){
            System.out.println(String.format("El número %d y el número %d son iguales",numberA,numberB));
        } else {
            System.out.println(numberB);
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        numberA = -1;
        var stringVerifyNumber = String.format("El número %d es ", numberA);
        if (numberA > 0) {
            stringVerifyNumber += "positivo";
        } else if(numberA == 0){
            stringVerifyNumber += "0";
        } else {
            stringVerifyNumber += "negativo";
        }
        System.out.println(stringVerifyNumber);
        // 4. Crea un programa que diga si un número es par o impar.
        if(numberB % 2 == 0){
            System.out.println(String.format("El número %d es par", numberB));
        } else {
            System.out.println(String.format("El número %d es impar", numberB));
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        if(numberA >= 1 && numberA <= 100){
            System.out.println(String.format("El número %d está en el rango de 1 a 100.", numberA));
        } else {
            System.out.println(String.format("El número %d NO está en el rango de 1 a 100.", numberA));
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dayWeek = 3;
        String nameDayWeek = "";
        switch (dayWeek) {
            case 1:
                nameDayWeek = "Lunes";
                break;
            case 2:
                nameDayWeek = "Martes";
                break;
            case 3:
                nameDayWeek = "Miercoles";
                break;
            case 4:
                nameDayWeek = "Jueves";
                break;
            case 5:
                nameDayWeek = "Viernes";
                break;
            case 6:
                nameDayWeek = "Sabado";
                break;
            case 7:
                nameDayWeek = "Domingo";
                break;
            default:
                nameDayWeek = "Dia no identificado!";
                break;
        }
        System.out.println(nameDayWeek);
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        double note = 89.9;
        String resultNotes = "";
        if (note < 50) {
            resultNotes = "Suspenso";
        } else if (note >=  50 && note < 90) {
            resultNotes = "Aprobado";
        } else {
            resultNotes = "Sobresaliente";
        }
        System.out.println(resultNotes);
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        age = 18;
        var accompained = false;
        if (age >= 15 || accompained) {
            System.out.println("Tienes al menos 15 años o vienes acompañado. Puedes pasar al cine.");
        } else {
            System.out.println("No puedes pasar al cine.");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letter = "h";
        if (letter.toLowerCase().matches("[aeiou]")){
            System.out.println(String.format("La letra %s es una vocal",letter));
        } else {
            System.out.println(String.format("La letra %s es una consonante",letter));
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 111;
        var b = 1211;
        var c = 91;
        var biggerNumber = "El número mayor es el que contiene ";
        if (a > b && a > c) {
            biggerNumber += "a";
        } else if (b > a && b > c) {
            biggerNumber += "b";
        } else if (c > a && c > b) {
            biggerNumber += "c";
        } else {
            biggerNumber = "Empate";
        }
        System.out.println(biggerNumber);
    }
}
