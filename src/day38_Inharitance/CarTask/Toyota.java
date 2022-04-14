package day38_Inharitance.CarTask;

public class Toyota extends Car{
    public Toyota(String model, int year, String color, double price, int miles) {
        super("Toyota", model, year, color, price, miles);
    }

public void reliable(){
    System.out.println(brand+ " "+ model+ " is reliable");
}



}
/*
1. Toyota:
					extra methods:
							reliable()
 */