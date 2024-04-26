package src.InventoryObjects.BaseObjects.Processor;

import src.Observer.ObserverIF;

public class CPU extends Processor {
    /**
     *  CPU.java
     *  Class to represent a central processing unit.
     *  Extends:
     *      Processor.java
     *
     */

    public CPU(int clockSpeed){
        super(clockSpeed);
    }

    public CPU(ObserverIF observer, int clockSpeed) {
        super(observer, clockSpeed);
    }
}
