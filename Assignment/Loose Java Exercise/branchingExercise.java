//program to verify candidate's age for vaccination
import java.util.*;
class branchingExercise {
    public static void main(String[] fasting) {
        // Declare new scanner object
        Scanner checkInput = new Scanner(System.in);
        // Ask user to input age
        System.out.println("Input your age: ");
        int age = checkInput.nextInt();
        if (age == 12) {
            System.out.println("You are eligible for vaccination");
        } else if (age > 12) {
            System.out.println("You are eligible for vaccination");
        } else {
            System.out.println("You are not eligible for vaccination");
        }
    }
}