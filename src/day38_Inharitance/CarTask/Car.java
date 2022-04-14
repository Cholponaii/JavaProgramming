package day38_Inharitance.CarTask;

public class Car {

    public String brand, model;
    public int year;
    public String color;
    public double price;
    public int miles;

    public Car(String brand, String model, int year, String color, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+ " "+ model+ " is starting");
    }

    public void drive(){
        System.out.println(brand+ " "+ model+ " is driving");
    }

    /*
    public void fly(){

    }
    fly() is not common for all the cars, and parent class schould only contain the common feature of
     */

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
