package src.InventoryObjects.BaseObjects.Processor;

import src.InventoryObjects.ObservableInventoryObject;
import src.Observer.ObserverIF;

public class Processor extends ObservableInventoryObject {
    /**
     *  Processor.java
     *  Abstract class to represent an abstract processor.
     *  Extends:
     *      ObservableInventoryObject.java
     *  Extended By:
     *      CPU.java
     *      GPU.java
     */

    private int clockSpeed; //measured in MHz

    public Processor(int clockSpeed) {this.clockSpeed = clockSpeed;}

    public Processor(ObserverIF observer, int clockSpeed ) {
        this.addObserver(observer);
        this.clockSpeed = clockSpeed;
    }

    public int getClockSpeed() {return this.clockSpeed;}
    public void setClockSpeed(int clockSpeed) {this.clockSpeed = clockSpeed;}
}
