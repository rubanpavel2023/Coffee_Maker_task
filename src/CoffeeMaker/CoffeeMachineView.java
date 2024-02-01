package CoffeeMaker;

import java.util.Scanner;

public class CoffeeMachineView {
    private Scanner scanner = new Scanner(System.in);
    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    public void start() {
        while (true) {
            System.out.println("Choose your drink:\n1 - Espresso\n2 - Cappuccino\n3 - Latte");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffeeMaker.setCoffee(new Espresso());
                    break;
                case 2:
                    coffeeMaker.setCoffee(new Cappuccino());
                    break;
                case 3:
                    coffeeMaker.setCoffee(new Latte());
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2 or 3.");
                    continue;
            }
            System.out.println(coffeeMaker.makeCoffee());
            return;
        }

    }
}
