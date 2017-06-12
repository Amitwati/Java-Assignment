package graphics;

import animals.Animal;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Amitw on 08-Jun-17.
 * observer class for the controller in the zoopanel
 */
public class ZooObserver extends Thread implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        synchronized (this) {
            notify();
        }
    }

    @Override
    public void run() {
        while(true){
            synchronized (this){
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("controller finished...");
                }
            }

            ZooPanel.getInstance(null).chckEat();
            ZooPanel.getInstance(null).repaint();
        }
    }
}
