package Factories;

import animals.Animal;
import animals.Elephant;
import animals.Giraffe;
import animals.Turtle;

/**
 * Created by Amitw on 07-Jun-17.
 * factory for animals that have "herbivore" diet
 */
public class HerbivoreFactory implements AbstractZooFactory {
    @Override
    public Animal produceAnimal(String type,int s, int h, int v, String c) {
        Animal an = null;
        switch(type){
            case "Elephant":
                an = new Elephant(s,h,v,c);
                break;
            case "Turtle":
                an = new Turtle(s,h,v,c);
                break;
            case "Giraffe":
                an = new Giraffe(s,h,v,c);
                break;
        }
        return an;
    }
}
