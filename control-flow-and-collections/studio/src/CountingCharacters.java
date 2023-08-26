import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to test: ");
        String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Error! No message detected!");
                return;
            }


        // Stores and updates the count
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loops through the string one char at a time
        for (char currentChar : input.toCharArray()) {
            if (Character.isLetterOrDigit(currentChar)) {
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
            }

        }

        // Loops through the HashMap to print the results
        for (char currentChar : charCountMap.keySet()) {
            System.out.println("Character " + currentChar + ", Count: " + charCountMap.get(currentChar));
        }
        System.out.println("Message characters counted successfully!");
        scanner.close();
    }
}

