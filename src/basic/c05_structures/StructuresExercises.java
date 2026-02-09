package basic.c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StructuresExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] towns = {"Villanueva", "Mostoles", "Jerez", "Torrelavega", "Chipiona"};
        System.out.println(towns.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(towns[1]);
        towns[1] = "Navalcarnero";
        System.out.println(towns[1]);
        // 3. Crea un ArrayList vacío.
        var clubs = new ArrayList<String>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        clubs.add("Real Madrid");
        clubs.add("Barcelona");
        clubs.add("Milan");
        clubs.add("Liverpool");
        clubs.remove(1);
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        numbers.add(1);
        numbers.add(3);
        // 7. Elimina uno de los elementos del HashSet.
        numbers.remove(1);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contacts = new HashMap<String,Integer>();
        contacts.put("Manuel",637248549);
        contacts.put("Isaac", 629012578);
        contacts.put("Rogelio", 701010571);
        // 9. Modifica uno de los contactos y elimina otro.
        contacts.put("Isaac", 628012578);
        contacts.remove("Rogelio");
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        // Array ===> ArrayList
        ArrayList<String> townList = new ArrayList<>(Arrays.asList(towns));
        // ArrayList ===> HashSet
        HashSet<String> townSet = new HashSet<>(townList);
        // HashSet ===> HashMap
        HashMap<String, String> townMap =
            townSet.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        Function.identity(),
                        (a, b) -> a,
                        HashMap::new
                ));
        System.out.println(townMap);
    }
}
