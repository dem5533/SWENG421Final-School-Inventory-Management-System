package src;
import java.util.ArrayList;
import java.util.List;
import src.InventoryObjects.InventoryObjectIF;
import src.Observer.ObserverIF;

public class InventoryManager {
    /**
     *  InventoryManager.java
     *  Class used to hold inventory objects internally.
     *  Contains:
     *      InventoryObjectIF.java
     *  Uses:
     *      ObserverIF.java
     *      InventoryObjectBuilderIF.java
     *  Used By:
     *      Client.java
     *
     */

    private static InventoryManager instance;
    private List<InventoryObjectIF> inventory;
    private List<ObserverIF> observers;

    private InventoryManager() {
        inventory = new ArrayList<InventoryObjectIF>();
        observers = new ArrayList<ObserverIF>();
    }

    public static InventoryManager getInstance(){
        if(instance == null){
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addObserver(ObserverIF observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverIF observer) {
        observers.remove(observer);
    }
}
