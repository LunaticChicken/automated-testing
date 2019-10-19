package com.epam.automation;

import static org.junit.Assert.assertTrue;

import collections.mainTask.Appliances.*;
import collections.mainTask.EnergyEfficiencyType;
import collections.mainTask.HomeControl;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class HomeControlTest
{
    private static List<Appliance> appliances = Arrays.asList(
            new Stove("GEFEST ПЭ 6570-04", 1200, EnergyEfficiencyType.D,52, 300),
            new Laptop("Lenovo Legion", 80, EnergyEfficiencyType.B, 16, "Intel Core i5", "NVIDIA GeForce GTX 1050 Ti", 550, 2300),
            new Lamp("Odeon Light", 40, EnergyEfficiencyType.E, 3000),
            new Lamp("ARTSTYLE TL-204B", 5, EnergyEfficiencyType.A, 5500),
            new Fridge("LG GA-B459SBDZ", 250, EnergyEfficiencyType.A, 247, -30)
    );

    private static Appliance applianceWithMinPowerValue = new Lamp("ARTSTYLE TL-204B", 5, EnergyEfficiencyType.A, 5500);

    private static boolean allOfAppliancesAreTurnedOn(List<Appliance> turnedOnAppliances) {
        for (Appliance appliance: turnedOnAppliances) {
            if (!appliance.isTurnedOn()) return false;
        }
        return true;
    }

    @Test
    public void testIsApplianceWithMinPower() {
        HomeControl homeControl = new HomeControl(appliances);
        Assert.assertEquals(applianceWithMinPowerValue, homeControl.getApplianceWithMinPower());
    }

    @Test
    public void testAllOfAppliancesAreTurnedOn() {
        HomeControl homeControl = new HomeControl(appliances);
        List<Appliance> turnedOnAppliances = homeControl.getTurnedOnAppliances();
        Assert.assertTrue(allOfAppliancesAreTurnedOn(turnedOnAppliances));
    }
}
