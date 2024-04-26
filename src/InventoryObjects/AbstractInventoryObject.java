package src.InventoryObjects;
import src.Observer.ObserverIF;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractInventoryObject extends ObservableInventoryObject {
    /**
     *  AbstractInventoryObject.java
     *  Abstract class that represents a complex inventory object for the composite pattern.
     *  Extends:
     *      ObservableInventoryObject.java
     *  Extended by:
     *      PrinterSuppliesPackage.java
     */

    private int id;
    private List<InventoryObjectIF> invObjList;

    public AbstractInventoryObject() {
        invObjList = new ArrayList<>();
    }

    public AbstractInventoryObject(ObserverIF observer) {
        this.addObserver(observer);
        invObjList = new ArrayList<>();
    }

    public void add(InventoryObjectIF object){
        invObjList.add(object);
    }

    public void remove(InventoryObjectIF object){
        invObjList.remove(object);
    }

    public InventoryObjectIF getIndex(int index){
        return invObjList.get(index);
    }
}
