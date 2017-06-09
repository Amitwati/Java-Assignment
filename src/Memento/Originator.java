package Memento;

import animals.Animal;

import java.util.ArrayList;

public class Originator {

    private ArrayList<Animal> animals;
    public void setState(ArrayList<Animal> animals) {
        this.animals = new ArrayList(animals);
    }
    public ArrayList<Animal> getState() { return animals; }
    public Memento createMemento() {
        return new Memento(animals);
    }
    public void setMemento(Memento memento) {
        this.animals = memento.getState();
    }
}
