package CoffeeMachine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scam.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scam.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scam.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scam.nextInt();

        int waterCup = water / 200;
        int milkCup = milk / 50;
        int beansCup = beans / 15;

        int lim = Math.min(waterCup, Math.min(milkCup, beansCup));

        if (cups > lim) {
            System.out.println("No, I can make only " + lim + " cup(s) of coffee");
        } else if (cups == lim) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int additionally = lim - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + additionally + " more than that)");
        }
    }
}