package day38_Inharitance.CarTask;

public class Tesla extends Car{

    public Tesla(String model, int year, String color, double price, int miles) {
        super("Tesla", model, year, color, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+ " "+ model+ " in autopilot mode");
    }

}

