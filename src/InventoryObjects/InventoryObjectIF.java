package src.InventoryObjects;
import src.Observer.ObserverIF;


public interface InventoryObjectIF {
    /**
     *  InventoryObjectIF.java
     *  Interface used in the composite/{insert more here} patterns.
     *  Extended by:
     *      AbstractInventoryObject.java
     *
     */

    public void addObserver(ObserverIF observer);
    public void removeObserver(ObserverIF observer);
}
