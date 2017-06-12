package Memento;

import java.util.ArrayList;

/**
 * Zoo memento class to handle all the mementos
 */
public class ZooMemento {
    private final int MAX_STATES = 3;
    private Memento[] statesList = new Memento[MAX_STATES];

    /**
     * Add a memento by index
     * @param m memento
     * @param index the index
     */
    public void addMemento(Memento m,int index) {
        statesList[index] = m;
    }

    /**
     * Get memento by index
     * After getting the memento, remove the memento from the states list
     * @param index index
     * @return memento by index
     */
    public Memento getMemento(int index) {
        if ( index  < MAX_STATES){
            Memento tmp = statesList[index];
            statesList[index] = null;
            return tmp;
        }
        return null;
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
        for (int i = 0;i< MAX_STATES;i++){
            if (statesList[i] != null){
                return true;
            }
        }
        return false;
    }
}