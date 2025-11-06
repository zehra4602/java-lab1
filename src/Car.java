public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;


    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }


    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }


    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) {
        if (year >= 1886) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Cars didn’t exist before 1886!");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }

    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative!");
        }
    }


    public void delivery(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }


    public void sell(int amount) {
        if (amount > 0 && amount <= this.quantity) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough stock or invalid amount!");
        }
    }


    @Override
    public String toString() {
        return "Car {" +
                "\n  Brand: " + brand +
                ",\n  Model: " + model +
                ",\n  Year: " + year +
                ",\n  Price: $" + price +
                ",\n  Color: " + color +
                ",\n  Quantity: " + quantity +
                "\n}";
    }
}
