package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;

public class Lamp extends Appliance {
    private int colourTemperature;

    public Lamp(String name, int power, EnergyEfficiencyType type, int colourTemperature) {
        super(name, power, type);
        this.colourTemperature = colourTemperature;
    }

    public int getColourTemperature() {
        return colourTemperature;
    }
}
