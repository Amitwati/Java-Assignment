package Memento;

import animals.Animal;
import food.EFoodType;
import plants.Plant;

import java.util.ArrayList;

public class Originator {

    private ArrayList<Animal> animals;
    private EFoodType foodType;
    private Plant plant;
    public void setState(ArrayList<Animal> animals, EFoodType foodType, Plant plant) {
        this.animals = new ArrayList(animals);
        this.foodType = foodType;
        this.plant = plant;

    }
    public Memento createMemento() {
        return new Memento(animals,foodType,plant);
    }
}
