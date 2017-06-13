package Memento;

import java.util.ArrayList;

/**
 * Zoo memento class to handle all the mementos
 */
public class ZooMemento {
    private final int MAX_STATES = 3;
    private ArrayList<Memento> statesList = new ArrayList<Memento>();

    /**
     * Add a memento by index
     * @param m memento
     */
    public void addMemento(Memento m) {
        statesList.add(m);
    }

    /**
     * Get memento by index
     * After getting the memento, remove the memento from the states list
     * @param index index
     * @return memento by index
     */
    public Memento getMemento(int index) {
        Memento tmp = statesList.get(index);
        statesList.remove(index);
        return  tmp;
    }

    /**
     * Get the maximum states allowed
     * @return the maximum states allowed
     */
    public int getMaxStates(){ return MAX_STATES;}


    /**
     * Check if the class have any states
     * @return
     */
    public boolean haveStates(){
        return !statesList.isEmpty();
    }

    public int getAmountOfStates(){
        return statesList.size();
    }
}