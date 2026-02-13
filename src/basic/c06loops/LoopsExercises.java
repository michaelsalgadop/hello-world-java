package basic.c06loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        var index = 0;
        while (index < 10) {
            System.out.println(index + 1);
            index ++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var clubs = new ArrayList<String>();
        clubs.add("Real Madrid");
        clubs.add("Barcelona");
        clubs.add("Manchester City");
        index = 0;
        do {
            System.out.println(clubs.get(index));
            index ++;
        }while(index < clubs.size());
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int number = 5; number <= 50; number += 5) {
            System.out.println(number);
        }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int [] numbers = {3, 5, 11, 7, 2};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(String.format("La suma total del array de 5 números es %d",sum));
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int number = 0; number < numbers.length; number++) {
            System.out.println(numbers[number]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var cars = new HashSet<String>();
        cars.add("Mustang");
        cars.add("Audi");
        cars.add("BMW");
        var daysOfWeek = new HashMap<Integer,String>();
        daysOfWeek.put(1,"Monday");
        daysOfWeek.put(2,"Tuesday");
        daysOfWeek.put(3,"Wednesday");
        daysOfWeek.put(4,"Thursday");
        daysOfWeek.put(5,"Friday");
        daysOfWeek.put(6,"Saturday");
        daysOfWeek.put(7,"Sunday");
        for (String car : cars) {
            System.out.println(car);
        }
        for(Map.Entry<Integer,String> day: daysOfWeek.entrySet()) {
            System.out.println(day.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int number = 10; number > 0; number --){
            System.out.println(number);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int i = 1; i <= 20; i++){
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        numbers[3] = -7;
        index = 0;
        do {
            if (numbers[index] < 0) {
                break;
            }
            System.out.println(numbers[index]);
            index ++;
        }while(index < numbers.length);
        // 10. Crea un programa que calcule el factorial de un número dado.
        int number = 8;
        int factorial = 1;
        index = 1;
        while(index <= number) {
            factorial *= index;
            index ++;
        }
        System.out.println(factorial);
    }
}
