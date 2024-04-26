package src.Builder;
import src.InventoryObjects.InventoryObjectIF;

public abstract class AbstractInventoryObjectBuilder {
    /**
     * AbstractInventoryObjectBuilder.java
     * Abstract class used in the builder pattern.
     *  Implements:
     *      InventoryObjectBuilderIF.java
     *  Extended By:
     *      InventoryObjectBuilder.java
     *
     */

    public static AbstractInventoryObjectBuilder getInstance(){
       return new InventoryObjectBuilder();
    }

    public abstract InventoryObjectIF getInventoryObject(String object);
}
