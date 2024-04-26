package src.InventoryObjects.CompositeObjects.Computer;

import src.InventoryObjects.BaseObjects.Battery;
import src.InventoryObjects.BaseObjects.Processor.CPU;
import src.InventoryObjects.BaseObjects.Processor.GPU;
import src.Observer.ObserverIF;

public class Laptop extends Computer {
    /**
     *  Laptop.java
     *  Class to represent a laptop computer.
     *  Extends:
     *      Computer.java
     */

    public Laptop(int cpuSpeed, int gpuSpeed, int batteryCap) {
        super(cpuSpeed, gpuSpeed);
        this.add(new Battery(batteryCap));
    }

    public Laptop(ObserverIF observer, int cpuSpeed, int gpuSpeed, int batteryCap) {
        super(observer, cpuSpeed, gpuSpeed);
        this.add(new Battery(batteryCap));
    }
}
