package collections.mainTask;

import collections.mainTask.Appliances.Appliance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeControl {
    private List<Appliance> appliances;

    public HomeControl(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public List<Appliance> getTurnedOnAppliances() {
        List<Appliance> turnedOnAppliances = new ArrayList<>();
        for (Appliance appliance : appliances) {
            if (appliance.isTurnedOn()) turnedOnAppliances.add(appliance);
        }
        return turnedOnAppliances;
    }

    public List<Appliance> getTurnedOffAppliances() {
        List<Appliance> turnedOnAppliances = new ArrayList<>();
        for (Appliance appliance : appliances) {
            if (!appliance.isTurnedOn()) turnedOnAppliances.add(appliance);
        }
        return turnedOnAppliances;
    }

    public List<Appliance> getAppliancesInRangeOfRequiredPowerValues(int minPower, int maxPower) {
        List<Appliance> appliancesInRangeOfPowerValues = new ArrayList<>();
        for (Appliance appliance : appliances) {
            if (appliance.getPower() <= maxPower && appliance.getPower() >= minPower)
                appliancesInRangeOfPowerValues.add(appliance);
        }
        return appliancesInRangeOfPowerValues;
    }

    public List<Appliance> getAppliancesInRangeOfRequiredEnergyEfficiencyTypes(EnergyEfficiencyType minType, EnergyEfficiencyType maxType) {
        List<Appliance> appliancesInRangeOfPowerValues = new ArrayList<>();
        for (Appliance appliance : appliances) {
            int ordinal = appliance.getEnergyEfficiencyType().ordinal();
            if (ordinal >= minType.ordinal() && ordinal <= maxType.ordinal()) appliancesInRangeOfPowerValues.add(appliance);
        }
        return appliancesInRangeOfPowerValues;
    }

    public List<Appliance> getAppliancesInRangeOfRequiredEnergyEfficiencyTypes(EnergyEfficiencyType minType) {
        return getAppliancesInRangeOfRequiredEnergyEfficiencyTypes(minType, EnergyEfficiencyType.A);
    }

    public Appliance getApplianceWithMaxPower() {
        Appliance applianceWithMaxPower = appliances.get(0);
        for (int i = 1; i < appliances.size(); i++) {
            Appliance currentAppliance = appliances.get(i);
            if (currentAppliance.getPower() > applianceWithMaxPower.getPower()) applianceWithMaxPower = currentAppliance;
        }
        return applianceWithMaxPower;
    }

    public Appliance getApplianceWithMinPower() {
        Appliance applianceWithMinPower = appliances.get(0);
        for (int i = 1; i < appliances.size(); i++) {
            Appliance currentAppliance = appliances.get(i);
            if (currentAppliance.getPower() < applianceWithMinPower.getPower()) applianceWithMinPower = currentAppliance;
        }
        return applianceWithMinPower;
    }

    public int getPowerConsumptionOfTurnedOnAppliances() {
        int powerConsumption = 0;
        for (Appliance appliance: getTurnedOnAppliances()) {
            powerConsumption += appliance.getPower();
        }
        return powerConsumption;
    }

    public int getPowerConsumptionOfAllAppliances() {
        int powerConsumption = 0;
        for (Appliance appliance: appliances) {
            powerConsumption += appliance.getPower();
        }
        return powerConsumption;
    }

    public HomeControl sortByPower() {
        appliances.sort(Comparator.comparingInt(Appliance::getPower));
        return this;
    }


}

