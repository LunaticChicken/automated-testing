package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;

public class Stove extends Appliance {

    //7900 58
    private int maxTemperature;
    private int ovenCapacity;

    public Stove(String name, int power, EnergyEfficiencyType type, int ovenCapacity, int maxTemperature) {
        super(name, power, type);
        this.ovenCapacity = ovenCapacity;
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getOvenCapacity() {
        return ovenCapacity;
    }
}
