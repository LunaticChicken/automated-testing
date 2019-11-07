package classes;

public class Main {
    public static void main(String[] args) {
        AbiturientList abiturients = new AbiturientList(
                new Abiturient("Иванов", "Сергей", "Иванович", 265),
                new Abiturient("Лебедевская", "Карина", "Юрьевна", 187),
                new Abiturient("Снитко", "Виталий", "Викторович", 311),
                new Abiturient("Чертенков", "Максим", "Сергеевич", 365),
                new Abiturient("Самохвал", "Захар", "Сергеевич", 299),
                new Abiturient("Бучило", "Даниил", "Дмитриевич", 326),
                new Abiturient("Бушило", "Татьяна", "Дмитриевич", 335),
                new Abiturient("Воронец", "Ярослав", "Дмитриевич", 289)
        );
        abiturients.add(new Abiturient("Сацута", "Полина", "Витальевна", 365));
        abiturients.add(new Abiturient("Путин", "Денис", "Дмитриевич", 299));

        System.out.println("Failed abiturients: " + abiturients.getFailedAbs(310));
        System.out.println("Passed abiturients: " + abiturients.getPassedAbs(310));
        System.out.println("Best abiturients: " + abiturients.getBestAbs(4));
    }
}
