public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car("Civic", "Honda", 2020, 24500.00, "White", 10);


        System.out.println("Initial Car Info:");
        System.out.println(myCar);


        myCar.sell(3);
        System.out.println("\nAfter selling 3 cars:");
        System.out.println("Quantity: " + myCar.getQuantity());


        System.out.println("\nCar Details via Getters:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());


        myCar.setColor("Black");
        myCar.setPrice(25990.00);
        myCar.delivery(5);


        System.out.println("\nFinal Car Info After Updates and Delivery:");
        System.out.println(myCar);
    }

}
