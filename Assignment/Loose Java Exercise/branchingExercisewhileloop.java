import java.io.*;

class branchingExercisewhileloop {
    public static void main(String[] fasting)
            throws IOException {
        BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (i <= 3) {
            System.out.println("Input your age: ");
            int age = Integer.parseInt(indata.readLine());
            switch (age) {
                case 100:
                case 18: {
                    System.out.println("You are eligible for vaccination");
                    break;
                }
                case 12: {
                    System.out.println("You are eligible for vaccination");
                    break;
                }
                default: {
                    System.out.println("You are not eligible for vaccination");
                }
            }
            i++;
        }
    }
}
