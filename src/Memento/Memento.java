package Memento;

import animals.Animal;
import food.EFoodType;
import plants.Plant;

import java.util.ArrayList;

/**
 * Memento class to store state of animal list and food
 */
public class Memento {

    private ArrayList<Animal> animals;
    private EFoodType foodType;
    private Plant plant;

    /**
     * Ctor
     * @param animals animal list
     * @param foodType food type
     * @param plant plant
     */
    public Memento(ArrayList<Animal> animals, EFoodType foodType, Plant plant){
        this.animals = new ArrayList(animals.size());
        for(Animal an:animals){
            try{
                this.animals.add((Animal)an.clone());
            }catch (CloneNotSupportedException e) {e.printStackTrace();}
        }
        this.foodType = foodType;
        this.plant = plant;

    }

    /**
     * Get the animal
     * @return the animal
     */
    public ArrayList<Animal> getAnimalState() { return animals; }

    /**
     * Get the food type
     * @return the food type
     */
    public EFoodType getFoodTypeState() { return foodType; }

    /**
     * get the plant
     * @return the plant
     */
    public Plant getPlantState() { return plant; }
}
