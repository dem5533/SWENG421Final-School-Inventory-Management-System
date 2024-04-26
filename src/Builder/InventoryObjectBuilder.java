package src.Builder;
import src.InventoryObjects.*;
import src.InventoryObjects.BaseObjects.*;
import src.InventoryObjects.BaseObjects.Processor.*;
import src.InventoryObjects.CompositeObjects.*;
import src.InventoryObjects.CompositeObjects.Computer.*;

import java.io.IOException;

public class InventoryObjectBuilder extends AbstractInventoryObjectBuilder {
/**
 *  InventoryObjectBuilder.java
 *  Builder object used to construct composite inventory objects.
 *  Extends:
 *      AbstractInventoryObjectBuilder.java
 */

    public InventoryObjectBuilder() {}

    @Override
    public InventoryObjectIF getInventoryObject(String object) {

        java.io.DataInput in = new java.io.DataInputStream(System.in);
        int batCap;
        int cpuSpeed;
        int gpuSpeed;

        switch(object) {
            case "battery":
                System.out.println("What is the capacity of the battery?");
                try {
                    batCap = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return new Battery(batCap);

            case "ink":
                return new Ink();

            case "paper":
                return new Paper();

            case "processor":
                System.out.println("What is the clock speed of the processor?");
                try {
                    cpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return new Processor(cpuSpeed);

            case "gpu":
                System.out.println("What is the clock speed of the gpu?");
                try {
                    gpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return new GPU(gpuSpeed);

            case "cpu":
                System.out.println("What is the clock speed of the cpu?");
                try {
                    cpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return new CPU(cpuSpeed);

            case "printer supplies":
                return new PrinterSuppliesPackage();

            case "computer":
                System.out.println("What is the clock speed of the CPU?");
                try {
                    cpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("What is the clock speed of the GPU?");
                try {
                    gpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                return new Computer(cpuSpeed, gpuSpeed);
            case "desktop":
                System.out.println("What is the clock speed of the CPU?");
                try {
                    cpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("What is the clock speed of the GPU?");
                try {
                    gpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                return new Desktop(cpuSpeed, gpuSpeed);
            case "laptop":
                System.out.println("What is the clock speed of the CPU?");
                try {
                    cpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("What is the clock speed of the GPU?");
                try {
                    gpuSpeed = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("What is the capactiy of the laptop's battery?");
                try {
                    batCap = Integer.parseInt(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                return new Laptop(cpuSpeed, gpuSpeed, batCap);
        } //end switch()

        return null;
    }
}
