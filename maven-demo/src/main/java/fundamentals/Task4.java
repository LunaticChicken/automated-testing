package fundamentals;

public class Task4 {
    public static void main(String[] args) {
        int sumResult = 0, multiplyResult = 1;
        for (int i = 0; i < args.length; i++) {
            sumResult += Integer.parseInt(args[i]);
            multiplyResult *= Integer.parseInt(args[i]);
        }
        System.out.println("Sum = " + sumResult);
        System.out.println("Product = " + multiplyResult);
    }
}
