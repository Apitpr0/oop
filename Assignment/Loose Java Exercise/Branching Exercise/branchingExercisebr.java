import java.io.*;

class branchingExercisebr {
    public static void main(String[] fasting)
            throws IOException {
        BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your age: ");
        int age = Integer.parseInt(indata.readLine());
        if (age == 12) {
            System.out.println("You are eligible for vaccination");
        } else if ((age >= 18 && age <= 100)) {
            System.out.println("You are eligible for vaccination");
        } else {
            System.out.println("You are not eligible for vaccination");
        }
    }
}
