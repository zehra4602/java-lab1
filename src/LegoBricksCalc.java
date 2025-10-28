public class LegoBricksCalc {
    public static void main(String[] args) {
        int bricks = 57;
        int capacity = 6;

        int fullContainers = bricks / capacity;
        int remaining = bricks % capacity;

        System.out.println("Full containers: " + fullContainers);
        System.out.println("Remaining bricks: " + remaining);
        System.out.println("Total containers needed: " +
                (fullContainers + (remaining > 0 ? 1 : 0)));
    }
}

