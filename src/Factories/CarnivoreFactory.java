package Factories;

import animals.Animal;

import animals.Lion;
import graphics.ZooPanel;

/**
 * Created by Amitw on 07-Jun-17.
 */
public class CarnivoreFactory implements AbstractZooFactory {
    @Override
    public Animal produceAnimal(String type,int s, int h, int v, String c) {
        Animal an = null;
        if(type.equals("Lion"))
            an = new Lion(s,h,v,c);
        return an;
    }
}
