package car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car Toyota = new Car("Toyota", 100);
        Car BMW = new Car("BMW", 200);
        boolean exit = false;
        Thread thread1;
        Thread thread2;
        while (!exit) {
            System.out.println("Enter case: ");
            Scanner scanner = new Scanner(System.in);
            String readString = scanner.nextLine();
            switch (readString) {
                //question 1:
                case "1":
                    Toyota.run();
                    BMW.run();
                    break;
                //question 2:
                case "2":
                    thread1 = new Thread(Toyota);
                    thread1.start();
                    thread2 = new Thread(BMW);
                    thread2.start();
                    break;
                //question 3:
                case "3":
                    Thread thread3 = new Thread(Toyota);
                    Thread thread4 = new Thread(BMW);
                    thread4.start();
                    thread3.start();
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid case");
                    break;
            }
        }
    }

}
