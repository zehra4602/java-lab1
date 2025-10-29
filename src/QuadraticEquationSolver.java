import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("a cannot be zero.");
            return;
        }

        double delta = b * b - 4 * a * c;
        int roots;

        if (delta < 0) roots = 0;
        else if (delta == 0) roots = 1;
        else roots = 2;

        switch (roots) {
            case 0:
                System.out.println("No real roots");
                break;
            case 1:
                double x1 = -b / (2 * a);
                System.out.printf("One root: x1 = %.2f\n", x1);
                break;
            case 2:
                double x2a = (-b - Math.sqrt(delta)) / (2 * a);
                double x2b = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("Two roots: x1 = %.2f, x2 = %.2f\n", x2a, x2b);
                break;
        }
    }
}
