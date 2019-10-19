package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;

public class Laptop extends Computer {
    private int timeOfWork;
    private int weight;

    public Laptop(String name, int power, EnergyEfficiencyType type, int RAMsize, String CPUname, String GPUname,
                  int timeOfWork, int weight) {
        super(name, power, type, RAMsize, CPUname, GPUname);
        this.timeOfWork = timeOfWork;
        this.weight = weight;
    }

    public int getTimeOfWork() {
        return timeOfWork;
    }

    public int getWeight() {
        return weight;
    }
}
