
//Convert a String to a primitive data in Java programs.
import java.io.*;

class Act6I {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int num; // declares an int variable

        System.out.println("Enter an integer:");
        str = stdin.readLine();
        num = Integer.parseInt(str);
        System.out.println("Integer Value: " + num);
    }
}
