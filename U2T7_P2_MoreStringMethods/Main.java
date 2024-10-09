package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int tries = 1;
        String wordBefore;
        String wordNow;

        // Game main
        System.out.print("Enter first word: ");
        wordBefore = scan.nextLine();

        while (!(score >= 50)){
            System.out.print("Enter next word: ");
            wordNow = scan.nextLine();

            // Conditions
            if(wordBefore.compareTo(wordNow) < 0){ // after +2
                score += 2;
                System.out.println("+2 points: Current word alphabetically after; SCORE: " + score);
            }
            if (wordBefore.compareTo(wordNow) > 0){ // before -5
                score -= 5;
                System.out.println("-5 points: Current word alphabetically before; SCORE: " + score);
            }
            if (wordBefore.compareTo(wordNow) == 0){ // if same word -10
                score -= 10; 
                System.out.println("-10 points: Current word is previous word; SCORE: " + score);
            }
            if (wordBefore.length() > 1 && wordNow.length() > 1){ // Check if word is longer than 1
                if (wordBefore.substring(wordBefore.length() - 2).equals(wordNow.substring(0, 2))){ // same start end 2 +5
                    score += 5;
                    System.out.println("+5 points: Last 2 letters of previous match first 2 letters of current; SCORE: " + score);
                }
            }
            if (wordNow.indexOf(wordBefore.substring(0,1)) != -1){
                score += 3;
                System.out.println("+3 points: The first letter of previous word is found in current word; SCORE: " + score);
            }
          
            tries += 1;
            wordBefore = wordNow;
        }

        // End
        System.out.println("You win! It took you " + tries + " words! Try again for a lower word count :)");
        scan.close();
    }
}
