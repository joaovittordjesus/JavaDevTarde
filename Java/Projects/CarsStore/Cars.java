import java.util.ArrayList;
import java.util.Scanner;

class Cars {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }
}

public class CarRegistrationSystem {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Car");
            System.out.println("2. List Cars");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter car model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter car year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    Car car = new Car(brand, model, year);
                    carList.add(car);
                    System.out.println("Car added successfully!");
                    break;
                case 2:
                    System.out.println("List of cars:");
                    for (Car c : carList) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}

