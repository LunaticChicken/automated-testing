package fundamentals;

public class Task3 {
    public static void main(String[] args) {
        int amountOfRows = Integer.parseInt(args[0]);
        System.out.println("Random numbers from 0 to 9:");
        for (int i = 0; i < amountOfRows; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((int)(Math.random()*10) + " ");
            }
            System.out.println((int)(Math.random()*10));
        }
    }
}
