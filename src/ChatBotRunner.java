import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ChatBot cb = new ChatBot();

        // Variables
        String userInput;
        String number = "n";
        String weather = "w";
        String conversion = "c";
        boolean compare;
        int inputNumber;

        // User Input
        cb.greeting();
        System.out.println();
        cb.help();
        cb.input();
        System.out.println();

        userInput = s.nextLine();
        compare = (userInput == number);
        System.out.println(compare);
        if(compare)
        {
            System.out.println("What is your favorite number?");
            inputNumber = s.nextInt();
            cb.favoriteNumber(inputNumber);
        }
    }
}
