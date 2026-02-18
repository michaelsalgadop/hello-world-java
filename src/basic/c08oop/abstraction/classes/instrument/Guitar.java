package basic.c08oop.abstraction.classes.instrument;

import basic.c08oop.abstraction.interfaces.Playable;

public class Guitar extends Instrument implements Playable {

    @Override
    public void sound() {
        System.out.println("Sonido endiablado!!");
    }

    @Override
    public void play() {
        System.out.println("Se toca las cuerdas");
    }
}
