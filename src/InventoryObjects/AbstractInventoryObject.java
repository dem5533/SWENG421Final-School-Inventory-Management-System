package src.InventoryObjects;
import java.util.List;

public abstract class AbstractInventoryObject implements InventoryObjectIF {
    /**
     *  AbstractInventoryObject.java
     *  Abstract class that represents a complex inventory object for the composite pattern.
     *  Extends:
     *      InventoryObjectIF
     *  Extended by:
     *
     */

    private int id;
    private List<InventoryObjectIF> invObjList;

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
