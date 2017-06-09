package Memento;

import animals.Animal;

import java.util.ArrayList;

/**
 * Created by Aviv1 on 09-Jun-17.
 */
public class Memento {

    private ArrayList<Animal> animals;
    public Memento(ArrayList<Animal> animals){
        this.animals = new ArrayList(animals);

    }
    public ArrayList<Animal> getState() { return animals; }

    public int getAmount(){return  animals.size();}
}
