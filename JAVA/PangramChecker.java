import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        //String input = "The quick brown fox jumps over the lazy dog"; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase for case-insensitivity
        input = input.replaceAll(" ", "").toLowerCase();

        // Create an array to track the occurrence of each letter in the alphabet
        int[] alphabetCount = new int[26];

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabetic character
            if (Character.isAlphabetic(c)) {
                // Calculate the index of the character in the alphabet
                int index = c - 'a';
                alphabetCount[index]++;
            }
        }

        // Check if each letter in the alphabet occurs at least once
        for (int count : alphabetCount) {
            if (count == 0) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true;
    }
}