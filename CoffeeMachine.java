import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {

    protected static int money = 550;
    protected static int cups = 9;
    protected static Scanner sc = new Scanner(System.in);

    protected static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(Ingredients.water + " ml of water");
        System.out.println(Ingredients.milk + " ml of milk");
        System.out.println(Ingredients.coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    protected static void buy() {

        System.out.println("Grab a cup that matches your mood. 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        int coffeeElection;
        String electionUser = sc.nextLine();

        if (Objects.equals(electionUser, "1") || Objects.equals(electionUser, "2") || Objects.equals(electionUser, "3")){
            coffeeElection = Integer.parseInt(electionUser);
        }else {
            return;
        }

        if (coffeeElection == 1) {
            if (Ingredients.water>=250 && Ingredients.coffeeBeans >= 16 && cups>0) {
                Ingredients.water -= 250;
                Ingredients.coffeeBeans -= 16;
                money += 4;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }else if (Ingredients.water < 250){
                System.out.println("Sorry, not enough water!");
            }else if (Ingredients.coffeeBeans < 16){
                System.out.println("Sorry, not enough coffee beans!");
            }else {
                System.out.println("Sorry, not enough cups!");
            }

        } else if (coffeeElection == 2) {
            if (Ingredients.water >= 350 && Ingredients.coffeeBeans >= 20 && Ingredients.milk >= 75 && cups>0) {
                Ingredients.water -= 350;
                Ingredients.milk -= 75;
                Ingredients.coffeeBeans -= 20;
                money += 7;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }else if (Ingredients.water < 350){
                System.out.println("Sorry, not enough water!");
            }else if (Ingredients.coffeeBeans < 20){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (cups < 1){
                System.out.println("Sorry, not enough cups!");
            }else {
                System.out.println("Sorry, not enough milk!");
            }

        } else if (coffeeElection == 3) {
            if (Ingredients.water >= 200 && Ingredients.coffeeBeans >= 100 && Ingredients.milk >= 12 && cups>0) {
                Ingredients.water -= 200;
                Ingredients.milk -= 100;
                Ingredients.coffeeBeans -= 12;
                money += 6;
                cups--;
                System.out.println("I have enough resources, making you a coffee!");
            }else if (Ingredients.water < 200){
                System.out.println("Sorry, not enough water!");
            }else if (Ingredients.coffeeBeans < 100){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (cups < 1){
                System.out.println("Sorry, not enough cups!");
            }else {
                System.out.println("Sorry, not enough milk!");
            }
        }
    }

    protected static void fill() {

        int userAmount;

        System.out.println("Write how many ml of water you want to add: ");
        userAmount = sc.nextInt();
        Ingredients.water += userAmount;
        System.out.println("Write how many ml of milk you want to add: ");
        userAmount = sc.nextInt();
        Ingredients.milk += userAmount;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        userAmount = sc.nextInt();
        Ingredients.coffeeBeans += userAmount;
        System.out.println("Write how many disposable cups you want to add: ");
        userAmount = sc.nextInt();
        cups += userAmount;
    }

    protected static void take() {
        money = 0;
    }

}
