import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float firstNumberOzer = input.nextFloat();

        System.out.println("Enter second number: ");
        float secondNumberOzer = input.nextFloat();

        float sum= firstNumberOzer+secondNumberOzer;
        float diff = firstNumberOzer-secondNumberOzer;
        float multiplier = firstNumberOzer*secondNumberOzer;
        float divisor = firstNumberOzer/secondNumberOzer;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Multiplier: " + multiplier);
        System.out.println("Divisor: " + divisor);

    }
}
