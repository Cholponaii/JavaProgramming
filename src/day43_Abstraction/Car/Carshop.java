package day43_Abstraction.Car;

public class Carshop {

    public static void main(String[] args) {

        //Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------------------------------------");


        honda.setColor("red");
        audi.setColor("black");
        tesla.setColor("blue");

        honda.setPrice(40000);
        audi.setPrice(50000);
        tesla.setPrice(70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}
