package Factories;

import animals.Animal;
import animals.Bear;

/**
 * Created by Amitw on 07-Jun-17.
 */
public class OmnivoreFactory implements AbstractZooFactory{
    @Override
    public Animal produceAnimal(String type,int s, int h, int v, String c) {
        Animal an = null;
        if(type.equals("Bear"))
           an = new Bear(s,h,v,c);
        return an;
    }
}
