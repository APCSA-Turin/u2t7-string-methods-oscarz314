package StringMethods;
import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();

        if (word1.length() > word2.length()){
            System.out.println(word1 + " is longer");
        }
        else if (word1.length() < word2.length()){
            System.out.println(word1 + " is longer");
        }
        else{
            System.out.println("Both strings have the same length");
        }

        // Variables
        int word1LengthHalf = word1.length() / 2;
        int word2LengthHalf = word2.length() / 2;

        // Word 1
        System.out.println("First half: " + word1.substring(0, word1LengthHalf));
        System.out.println("Second half: " + word1.substring(word1LengthHalf));

        // Word 2
        System.out.println("First half: " + word2.substring(0, word2LengthHalf));
        System.out.println("Second half: " + word2.substring(word2LengthHalf));

        if (word1.indexOf(word2) != -1){
            System.out.println(word2 + " is found in index " + word1.indexOf(word2));
        }
        else{
            System.out.println(word2 + " is NOT found in " + word1);
        }

        scan.close();
    }
}