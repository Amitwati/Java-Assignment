package Factories;

import animals.Animal;


/**
 * Created by Amitw on 07-Jun-17.
 */
public interface AbstractZooFactory{
    Animal produceAnimal(String type,int s, int h, int v, String c);
    static AbstractZooFactory createAnimalFactory(String type){
        AbstractZooFactory zooFactory= null;
        switch(type){
            case "Carnivore":
                zooFactory = new CarnivoreFactory();
                break;
            case "Herbivore":
                zooFactory = new HerbivoreFactory();
                break;
            case "Omnivore":
                zooFactory = new OmnivoreFactory();
                break;
        }
        return zooFactory;
    }
}
