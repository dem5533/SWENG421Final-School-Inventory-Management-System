package src.InventoryObjects.BaseObjects;

import src.InventoryObjects.ObservableInventoryObject;
import src.Observer.ObserverIF;

public class Ink extends ObservableInventoryObject {
    /**
     *  Ink.java
     *  Class to represent ink as an inventory object.
     *  Extends:
     *      ObservableInventoryObject.java
     */

    public Ink() {}
    public Ink(ObserverIF observer) {
        this.addObserver(observer);
    }
}
