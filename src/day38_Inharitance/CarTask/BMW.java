package day38_Inharitance.CarTask;

public class BMW extends Car{


    public BMW(String model, int year, String color, double price, int miles) {
        super("BMW", model, year, color, price, miles);
    }

    public void breaksDowns(){
        System.out.println(brand+" "+ model+ " is breaking down");
    }

    public void racing(){
        System.out.println(brand+" "+ model+ " is racing");
    }



}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */