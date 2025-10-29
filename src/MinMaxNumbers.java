import java.util.Random;

public class MinMaxNumbers {public static void main(String[] args) {
    Random rand = new Random();
    int count = 0;

    int number = rand.nextInt(100) + 1;
    int min = number;
    int max = number;

    while (count < 9) {
        number = rand.nextInt(100) + 1;
        if (number < min) min = number;
        if (number > max) max = number;
        count++;
    }

    System.out.println("Smallest number: " + min);
    System.out.println("Largest number: " + max);
}

}
