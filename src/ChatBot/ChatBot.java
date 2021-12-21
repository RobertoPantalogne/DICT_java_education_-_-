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

    }
}
