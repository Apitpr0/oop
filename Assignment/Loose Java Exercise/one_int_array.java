import java.io.*;

public class one_int_array {
    public static void main(String args[])
            throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int marks[] = new int[6]; // array declaration

        // Accepting marks from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            str = stdin.readLine();
            marks[i] = Integer.parseInt(str);
        }
        // Displaying the array
        for (int i = 0; i < 5; i++) {
            System.out.print("\n marks" + (i + 1) + ":" + marks[i]);
        }
    }
}
