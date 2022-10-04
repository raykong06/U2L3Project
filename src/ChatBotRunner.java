import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ChatBot cb = new ChatBot();

        // Variables
        String userInput;
        String info = "i";
        String weather = "w";
        String conversion = "c";
        boolean compare;

        // User Input
        cb.greeting();
        System.out.println();
        cb.help();
        cb.input();
        System.out.println();

        userInput = s.nextLine();
        compare = userInput == info;
    }
}
