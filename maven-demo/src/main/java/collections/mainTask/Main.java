package collections.mainTask;

import collections.mainTask.Appliances.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Appliance> appliances = Arrays.asList(
                new Stove("GEFEST ПЭ 6570-04", 1200, EnergyEfficiencyType.D,52, 300),
                new Laptop("Lenovo Legion", 80, EnergyEfficiencyType.B, 16, "Intel Core i5", "NVIDIA GeForce GTX 1050 Ti", 550, 2300),
                new Lamp("Odeon Light", 40, EnergyEfficiencyType.E, 3000),
                new Lamp("ARTSTYLE TL-204B", 5, EnergyEfficiencyType.A, 5500),
                new Fridge("LG GA-B459SBDZ", 250, EnergyEfficiencyType.A, 247, -30)
        );

        appliances.get(0).turnOn();
        appliances.get(2).turnOn();
        appliances.get(4).turnOn();

        HomeControl homeControl = new HomeControl(appliances);
        System.out.println("Appliance with minimal power: " + homeControl.getApplianceWithMinPower());
        homeControl.sortByPower();
        System.out.println("Appliances, sorted by power: " + appliances);
        System.out.println("Appliances in range of power values (0, 40): " + homeControl.getAppliancesInRangeOfRequiredPowerValues(0, 40));
        System.out.println("Appliances in range of required types (C, B): " +
                homeControl.getAppliancesInRangeOfRequiredEnergyEfficiencyTypes(EnergyEfficiencyType.E, EnergyEfficiencyType.C));
        System.out.println("Appliances with minimal required type of energy efficiency (B): " +
                homeControl.getAppliancesInRangeOfRequiredEnergyEfficiencyTypes(EnergyEfficiencyType.B));
        System.out.println("Turned off appliances: " + homeControl.getTurnedOffAppliances());
        System.out.println("Power consumption of turned on appliances: " + homeControl.getPowerConsumptionOfTurnedOnAppliances());

    }
}
