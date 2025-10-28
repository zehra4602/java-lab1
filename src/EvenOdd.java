import java.util.Random;

public class EvenOdd {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        System.out.println("Number: " + number);

        if (number % 2 == 0) {
            System.out.println("This number is EVEN.");
        } else {
            System.out.println("This number is ODD.");
        }
    }
}
