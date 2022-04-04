
//Import package io to use InputStreamReader and BufferedReader class
import java.io.*;

public class Act3B {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader InStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(InStream);

        // Declare Variable
        String str;
        int age;

        System.out.println("Enter your age:");
        str = stdin.readLine(); // read input that is entered by user
        age = Integer.parseInt(str); // Conver str to int

        // Display an input that was entered by user
        System.out.println("Your age is: " + age);

    }// end main()
}// end class
