package teamproject;

public class CycleRent {
	import java.util.Scanner;

	class Car {
	    String[] brand = {"BMW", "Audi", "Benz", "Rolls Royce"};
	    String[] seat_size = {"4 seater", "4 seater", "5 seater", "4 seater"};
	    String[] color = {"Black", "White", "Red", "Blue"};
	    String[] rent = {"10000", "8000", "7000", "10000"};
	    boolean[] isAvailable = {true, true, true, true};

	    void display() {
	        Scanner sc = new Scanner(System.in);
	        boolean anyAvailable = false;
	        System.out.println("\n--- Available Cars ---");
	        for (int i = 0; i < brand.length; i++) {
	            if (isAvailable[i]) {
	                anyAvailable = true;
	                System.out.println((i + 1) + ". " + brand[i] + " | " + seat_size[i] + " | Color: " + color[i] + " | Rent: Rs. " + rent[i] + "/hour");
	            }
	        }

	        if (!anyAvailable) {
	            System.out.println("Sorry, no cars available at the moment.");
	            return;
	        }

	        System.out.print("Select your choice (1-" + brand.length + "): ");
	        int choice = sc.nextInt();

	        if (choice >= 1 && choice <= brand.length && isAvailable[choice - 1]) {
	            int index = choice - 1;
	            System.out.println("\nYou have selected:");
	            System.out.println(brand[index] + " | " + seat_size[index] + " | Color: " + color[index] + " | Rent: Rs. " + rent[index] + "/hour");
	            isAvailable[index] = false; // mark as rented
	        } else {
	            System.out.println("Invalid selection or Car not available.");
	        }
	    }
	}
	class Bike {
	    String[] brand = {"Yamaha", "Ducati", "Harley", "Royal Enfield"};
	    String[] color = {"Black", "White", "Red", "Blue"};
	    String[] rent = {"1000", "2000", "2500", "1500"};
	    boolean[] isAvailable = {true, true, true, true};

	    void display() {
	        Scanner sc = new Scanner(System.in);
	        boolean anyAvailable = false;
	        System.out.println("\n--- Available Bikes ---");
	        for (int i = 0; i < brand.length; i++) {
	            if (isAvailable[i]) {
	                anyAvailable = true;
	                System.out.println((i + 1) + ". " + brand[i] + " | Color: " + color[i] + " | Rent: Rs. " + rent[i] + "/hour");
	            }
	        }

	        if (!anyAvailable) {
	            System.out.println("Sorry, no bikes available at the moment.");
	            return;
	        }

	        System.out.print("Select your choice (1-" + brand.length + "): ");
	        int choice = sc.nextInt();

	        if (choice >= 1 && choice <= brand.length && isAvailable[choice - 1]) {
	            int index = choice - 1;
	            System.out.println("\nYou have selected:");
	            System.out.println(brand[index] + " | Color: " + color[index] + " | Rent: Rs. " + rent[index] + "/hour");
	            isAvailable[index] = false; // mark as rented
	        } else {
	            System.out.println("Invalid selection or Bike not available.");
	        }
	    }
	}
	public class CycleRent {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Car car = new Car();
	        Bike bike = new Bike();

	        while (true) {
	            System.out.println("\nWelcome to DK Rental Shop");
	            System.out.println("Choose your vehicle:\n1. Car\n2. Bike\n3. Exit");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    car.display();
	                    break;
	                case 2:
	                    bike.display();
	                    break;
	                case 3:
	                    System.out.println("Thank you for visiting!");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

