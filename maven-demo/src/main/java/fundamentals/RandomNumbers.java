package fundamentals;

public class RandomNumbers {
    public static void main(String[] args) {
        int amountOfNumbers = Integer.parseInt(args[0]);
        System.out.println("Random numbers from 0 to 9:");
        for (int i = 0; i < amountOfNumbers; i++) {
            if (i % 5 == 4) {
                System.out.println((int)(Math.random()*10));
            } else {
                System.out.print((int)(Math.random()*10) + " ");
            }
        }
    }

}
