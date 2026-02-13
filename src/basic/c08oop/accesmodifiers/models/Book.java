package basic.c08oop.accesmodifiers.models;

public class Book {
    private final String TITLE;

    public Book(String title) {
        this.TITLE = title;
    }

    public String getTITLE() {
        return TITLE;
    }
}
