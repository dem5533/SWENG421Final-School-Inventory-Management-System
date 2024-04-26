package src.InventoryObjects.BaseObjects;
import src.InventoryObjects.ObservableInventoryObject;
import src.Observer.ObserverIF;

public class Battery extends ObservableInventoryObject {
    /**
     *  Batter.java
     *  Class to represent a battery.
     *  Extends:
     *      ObservableInventoryObject.java
     */

    private int capacity; //stored in mAh

    public Battery(int capacity) {this.capacity = capacity;}

    public Battery(ObserverIF observer, int capacity) {
        this.addObserver(observer);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {this.capacity = capacity;}
}
