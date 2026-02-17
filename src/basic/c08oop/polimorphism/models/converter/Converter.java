package basic.c08oop.polimorphism.models.converter;

public class Converter {
    public String convert (int number) {
        return "Número entero: " + number;
    }
    public String convert (double number) {
        return "Número decimal: " + number;
    }
    public String convert (String text) {
        return "Texto: " + text;
    }
}
