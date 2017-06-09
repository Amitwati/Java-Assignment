package Memento;

import animals.Animal;
import food.EFoodType;
import plants.Plant;

import java.util.ArrayList;

/**
 * Created by Aviv1 on 09-Jun-17.
 */
public class Memento {

    private ArrayList<Animal> animals;
    private EFoodType foodType;
    private Plant plant;
    public Memento(ArrayList<Animal> animals, EFoodType foodType, Plant plant){
        this.animals = new ArrayList(animals);
        this.foodType = foodType;
        this.plant = plant;

    }
    public ArrayList<Animal> getAnimalState() { return animals; }
    public EFoodType getFoodTypeState() { return foodType; }
    public Plant getPlantState() { return plant; }
}
