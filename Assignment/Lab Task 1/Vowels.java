
//import all java util
import java.util.*;

//start of class
public class Vowels
// Class start
{
    // start of main method
    public static void main(String args[]) {
        // Declare new char array named vowels with index of 5
        char[] vowels = new char[3];
        // Declare scanner as a new object
        Scanner in = new Scanner(System.in);
        // Ask user to input 3 vowel character
        System.out.println("Enter 3 Vowel Character: ");
        /*
         * Start of for loop to check
         * for vowels. if non vowal is inserted program keeps running until 3 vowel is
         * inserted
         */
        for (int i = 0; i <= 2; i++) {
            vowels[i] = in.next().charAt(0);
            if (vowels[i] != 'a' && vowels[i] != 'e' && vowels[i] != 'i' && vowels[i] != 'o' && vowels[i] != 'u') {
                i--;
            }
        }
        // Output what character is inside the array
        for (int i = 0; i <= 2; i++) {
            System.out.println("Stored vowel characters in array is = " + vowels[i]);
        }
    }
}
