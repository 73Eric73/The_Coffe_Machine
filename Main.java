import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String chose = "";

        while (!chose.equals("exit")) {

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            chose = sc.nextLine();

            switch (chose) {
                case "remaining" -> CoffeeMachine.remaining();
                case "buy" -> CoffeeMachine.buy();
                case "fill" -> CoffeeMachine.fill();
                case "take" -> CoffeeMachine.take();
            }
        }

        System.out.println("Thanks, Have a nice day!");

    }
}
