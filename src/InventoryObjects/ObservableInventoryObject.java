package src.InventoryObjects;

import src.Observer.ObserverIF;

public abstract class ObservableInventoryObject implements InventoryObjectIF {
    /**
     *  ObservableInventoryObject.java
     *  Class to handle observer objects for all inventory objects via inheritance.
     *  Implements:
     *      InventoryObject.java
     *  Extended By:
     *      Battery.java
     *      Processor.java
     *      Paper.java
     *      Ink.java
     *      AbstractInventoryObject.java
     */

    private ObserverIF observer = null;

    @Override
    public void addObserver(ObserverIF observer) {
        if(this.observer != null) {
            System.out.println("This object already has an observer.");
        }
        else {
            this.observer = observer;
        }
    }

    @Override
    public void removeObserver(ObserverIF observer) {
        if (this.observer == observer) {
            this.observer = null;
        }
        else {
            System.out.println("The passed in observer does not observe this object.");
        }
    }
}
