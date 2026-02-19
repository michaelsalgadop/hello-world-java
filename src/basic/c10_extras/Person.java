package basic.c10_extras;

public class Person {
    /** Nombre de la persona */
    private String name;
    /** Años de la persona */
    private int age;
    /**
     * Constructor de la clase Persona
     * @param name nombre de la persona
     * @param age años de la persona
     * */
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    /**
     * Asigna valor al atributo name.
     * @param name nombre de la persona.
     * @throws IllegalArgumentException si el nombre contiene números o es nulo o viene vacío
     * */
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Nombre inválido. Introduce un nombre sin números correctamente!");
        }
        this.name = name;
    }
    /**
     * Asigna valor al atributo age.
     * @param age años de la persona.
     * @throws IllegalArgumentException si age es negativo
     * */
    public void setAge(int age) throws IllegalArgumentException{
        if (age < 0) {
            throw new IllegalArgumentException("Años deben ser positivos");
        }
        this.age = age;
    }
    /**
     * Obtener nombre
     * @return nombre de la persona
     * */
    public String getName() {
        return name;
    }
    /**
     * Obtener años
     * @return años de la persona
     * */
    public int getAge() {
        return age;
    }
}
