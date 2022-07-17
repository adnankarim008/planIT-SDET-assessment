import java.util.Scanner;

public class maxOccurringCharacter {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String userResponse;

        System.out.print("Welcome!!\n");

        System.out.print("Type a string to find the maximum number of occurring character\n$");
        userResponse = userInput.nextLine();

        System.out.println("Max occurring character is " +
            getHighestOccuringCharacter(userResponse));

    }

    static char getHighestOccuringCharacter(String word) {
        int count[] = new int[256];

        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            count[Character.toLowerCase(word.charAt(i))]++;

        }
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < wordLength; i++) {
            if (max < count[Character.toLowerCase(word.charAt(i))]) {
                max = count[Character.toLowerCase(word.charAt(i))];
                result = Character.toLowerCase(word.charAt(i));
            }
        }

        return result;
    }

}