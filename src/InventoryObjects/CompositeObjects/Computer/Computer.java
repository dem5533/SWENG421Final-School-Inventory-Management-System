package src.InventoryObjects.CompositeObjects.Computer;
import src.InventoryObjects.AbstractInventoryObject;
import src.InventoryObjects.BaseObjects.Processor.CPU;
import src.InventoryObjects.BaseObjects.Processor.GPU;
import src.Observer.ObserverIF;

public class Computer extends AbstractInventoryObject {
    /**
     *  Computer.java
     *  Class to represent a computer with CPU and GPU.
     *  Extends:
     *      AbstractInventoryObject.java
     *  Extended By:
     *      Laptop.java
     *      Desktop.java
     */

    public Computer(int cpuSpeed, int gpuSpeed) {
        this.add(new CPU(cpuSpeed));
        this.add(new GPU(gpuSpeed));
    }

    public Computer(ObserverIF observer, int cpuSpeed, int gpuSpeed) {
        super(observer);
        this.add(new CPU(cpuSpeed));
        this.add(new GPU(gpuSpeed));
    }
}
