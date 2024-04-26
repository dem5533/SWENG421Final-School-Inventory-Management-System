package src.InventoryObjects.CompositeObjects;
import src.InventoryObjects.AbstractInventoryObject;
import src.InventoryObjects.BaseObjects.Ink;
import src.InventoryObjects.BaseObjects.Paper;
import src.Observer.ObserverIF;

public class PrinterSuppliesPackage extends AbstractInventoryObject {
    /**
     *  PrinterSuppliesPackage.java
     *  Class to represent a bundle of supplies used for a printer.
     *  Extends:
     *      AbstractInventoryObject.java
     */

    public PrinterSuppliesPackage() {
        this.add(new Paper());
        this.add(new Ink());
    }

    public PrinterSuppliesPackage(ObserverIF observer) {
        super(observer);
        this.add(new Paper());
        this.add(new Ink());
    }
}
