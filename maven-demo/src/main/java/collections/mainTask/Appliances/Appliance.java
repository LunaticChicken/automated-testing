package collections.mainTask.Appliances;

import collections.mainTask.EnergyEfficiencyType;
import java.util.Objects;

public abstract class Appliance {
    private String name;
    private int power;
    private EnergyEfficiencyType type;
    private boolean isTurnedOn = false;

    public Appliance(String name, int power, EnergyEfficiencyType type) {
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public EnergyEfficiencyType getEnergyEfficiencyType() {
        return type;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return  name.equals(appliance.name) &&
                power == appliance.power &&
                type == appliance.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, type);
    }
}
