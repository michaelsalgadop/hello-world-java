package basic.c08oop.abstraction.classes.document;

public class PDFDocument extends Document{

    @Override
    public void print() {
        System.out.println("Impreso fichero PDF");
    }
}
