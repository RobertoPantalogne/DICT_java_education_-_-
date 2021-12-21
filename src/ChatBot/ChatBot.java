package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        Scanner scamer = new Scanner(System.in);
        String bot_name = "Mehmet";
        int birth_year = 1992;
        System.out.println("Hello my name is " + bot_name);
        System.out.println("I was created in " + birth_year);
        System.out.println("Please remind me your name ");
        String scaner = scamer.nextLine();
        System.out.println("What a great name you have " + scaner);
        System.out.println("Let guess your age");
        System.out.println("Enter remainders of dividing your age by 3,5 and 7");
        int remainder3 = scamer.nextInt();
        int remainder5 = scamer.nextInt();
        int remainder7 = scamer.nextInt();
       int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that`s a great age to start programming!");




    }
}
