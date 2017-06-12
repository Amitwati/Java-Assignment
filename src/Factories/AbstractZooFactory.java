package Factories;

import animals.Animal;


/**
 * Created by Amitw on 07-Jun-17.
 * abstract factory interface to create factories for the animal type by diet
 */
public interface AbstractZooFactory{
    /**
     * create animal by the type and and other params
     * @param type
     *              animal type
     * @param s
     *              animal size
     * @param h
     *              animal hor speed
     * @param v
     *              animal ver speed
     * @param c
     *              animal color
     * @return animal instance
     */
    Animal produceAnimal(String type,int s, int h, int v, String c);

    /**
     * create factory by its name
     * @param type
     *          factory name
     * @return  factory of the animals diet
     */
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
