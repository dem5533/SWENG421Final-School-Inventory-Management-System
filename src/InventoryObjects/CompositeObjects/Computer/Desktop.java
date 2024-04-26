package src.InventoryObjects.CompositeObjects.Computer;

import src.Observer.ObserverIF;

public class Desktop extends Computer {
    /**
     *  Desktop.java
     *  Class to represent a desktop computer.
     *  Extends:
     *      Computer.java
     */

    public Desktop(int cpuSpeed, int gpuSpeed) {
        super(cpuSpeed, gpuSpeed);
    }

    public Desktop(ObserverIF observer, int cpuSpeed, int gpuSpeed) {
        super(observer, cpuSpeed, gpuSpeed);
    }
}
