package src.InventoryObjects.BaseObjects.Processor;

import src.Observer.ObserverIF;

public class GPU extends Processor {
    /**
     *  GPU.java
     *  Class to represent a graphics card.
     *  Extends:
     *      Processor.java
     *
     */

    public GPU(int clockSpeed) {
        super(clockSpeed);
    }

    public GPU(ObserverIF observer, int clockSpeed) {
        super(observer, clockSpeed);
    }
}
