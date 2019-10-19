package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;

public class Fridge extends Appliance {
    private int capacity;
    private int minTemperature;

    public Fridge(String name, int power, EnergyEfficiencyType type, int capacity, int minTemperature) {
        super(name, power, type);
        this.capacity = capacity;
        this.minTemperature = minTemperature;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
}
