package ex_tkdthr;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor){
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
}
