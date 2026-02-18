package basic.c08oop.abstraction.classes.instrument;

import basic.c08oop.abstraction.interfaces.Playable;

public class Piano extends Instrument implements Playable {
    @Override
    public void sound() {
        System.out.println("Sonido armónico, casi angelical!");
    }

    @Override
    public void play() {
        System.out.println("Se tocan sus teclas");
    }
}
