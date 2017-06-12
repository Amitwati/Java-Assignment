package Memento;

import animals.Animal;
import food.EFoodType;
import plants.Plant;

import java.util.ArrayList;

/**
 * Originator class to create mementos
 */
public class Originator {

    private ArrayList<Animal> animals;
    private EFoodType foodType;
    private Plant plant;

    /**
     * Set state to the originator
     * @param animals animal list
     * @param foodType food type
     * @param plant plant
     */
    public void setState(ArrayList<Animal> animals, EFoodType foodType, Plant plant) {
        this.animals = new ArrayList(animals);
        this.foodType = foodType;
        this.plant = plant;

    }

    /**
     * Return memento with the current states
     * @return memento with the current states
     */
    public Memento createMemento() {
        return new Memento(animals,foodType,plant);
    }
}
