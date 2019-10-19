package classes;

import java.util.*;

public class AbiturientList extends ArrayList<Abiturient> {
    public AbiturientList(Abiturient...abs) {
        this.addAll(Arrays.asList(abs));
    }
    
    public List<Abiturient> getFailedAbs(int requiredBalls) {
        List<Abiturient> listOfFailedAbs = new ArrayList<>();
        for(Abiturient i : this) {
            if (i.getBalls() < requiredBalls) listOfFailedAbs.add(i);
        }
        return listOfFailedAbs;
    }

    public List<Abiturient> getPassedAbs(int requiredBalls) {
        List<Abiturient> listOfPassedAbs = new ArrayList<>();
        for(Abiturient i : this) {
            if (i.getBalls() >= requiredBalls) listOfPassedAbs.add(i);
        }
        return listOfPassedAbs;
    }

    public List<Abiturient> getBestAbs(int amount) {
        List<Abiturient> bestAbs = new ArrayList<>();
        this.sort((o1, o2) -> o2.getBalls() - o1.getBalls());
        for (int i = 0; i < amount; i++) {
            bestAbs.add(this.get(i));
        }
        return bestAbs;
    }
}
