import java.util.Scanner;

public class BMICslculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height (m): ");
        float heightozer = input.nextFloat();

        System.out.println("Enter weight (kg): ");
        float  weightozer = input.nextFloat();

        float bmi = (float)(weightozer / Math.pow(heightozer, 2));
        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 16.0) System.out.println("Starvation");
        else if (bmi <= 16.99) System.out.println("Emaciation");
        else if (bmi <= 18.49) System.out.println("Underweight");
        else if (bmi <= 22.99) System.out.println("Normal, low range");
        else if (bmi <= 24.99) System.out.println("Normal, high range");
        else if (bmi <= 27.49) System.out.println("Overweight, low range");
        else if (bmi <= 29.99) System.out.println("Overweight, high range");
        else if (bmi <= 34.9) System.out.println("1st degree obesity");
        else if (bmi <= 39.9) System.out.println("2nd degree obesity");
        else System.out.println("3rd degree obesity");

    }
}
