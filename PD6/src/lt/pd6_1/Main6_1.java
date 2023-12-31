package lt.pd6_1;

public class Main6_1 {
    public static void main(String[] args) {
        String[] cars = {"audi", "mazda", "toyota", "BMW", "MB"};

        String[] newCars = cars.clone();

        for (int i = 0; i < newCars.length; i++) {
            System.out.println("Original cars: " + cars[i]);
            System.out.println("clone of cars: " + newCars[i]);
        }

    }

}
