package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;

public class Computer extends Appliance {
    private int RAMsize;
    private String CPUname;
    private String GPUname;

    public Computer(String name, int power, EnergyEfficiencyType type, int RAMsize, String CPUname, String GPUname) {
        super(name, power, type);
        this.RAMsize = RAMsize;
        this.CPUname = CPUname;
        this.GPUname = GPUname;
    }

    public int getRAMsize() {
        return RAMsize;
    }
}
