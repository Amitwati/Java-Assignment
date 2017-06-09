package Memento;

import java.util.ArrayList;

public class ZooMemento {
    private final int MAX_STATES = 3;
    private Memento[] statesList = new Memento[MAX_STATES];
    public void addMemento(Memento m,int index) {
        statesList[index] = m;
    }
    public Memento getMemento(int index) {
        if ( index  < MAX_STATES){
            Memento tmp = statesList[index];
            statesList[index] = null;
            return tmp;
        }
        return null;
    }

    public int getMaxStates(){ return MAX_STATES;}

    public boolean haveStates(){
        for (int i = 0;i< MAX_STATES;i++){
            if (statesList[i] != null){
                return true;
            }
        }
        return false;
    }
}