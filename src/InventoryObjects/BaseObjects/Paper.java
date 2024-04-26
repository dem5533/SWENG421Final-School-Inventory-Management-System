package src.InventoryObjects.BaseObjects;

import src.InventoryObjects.ObservableInventoryObject;
import src.Observer.ObserverIF;

public class Paper extends ObservableInventoryObject {
    /**
     *  Paper.java
     *  Class to represent paper inventory objects.
     *  Extends:
     *      ObservableInventoryObject.java
     */

    public Paper() {}
    public Paper(ObserverIF observer) {
        this.addObserver(observer);
    }
}
