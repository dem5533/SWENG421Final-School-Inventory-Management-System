package src.Builder;

public abstract class AbstractInventoryObjectBuilder implements InventoryObjectBuilderIF{
    /**
     * AbstractInventoryObjectBuilder.java
     * Abstract class used in the builder pattern.
     *  Implements:
     *      InventoryObjectBuilderIF.java
     *  Extended By:
     *      InventoryObjectBuilder.java
     *
     */

    private static AbstractInventoryObjectBuilder instance;

    public static AbstractInventoryObjectBuilder getInstance(){
        if(instance == null){
            //instance = new AbstractInventoryObjectBuilder();
        }
        return instance;
    }
}
