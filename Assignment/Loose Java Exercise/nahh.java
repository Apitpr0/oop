public class nahh {
    //create a program that check minimum and maximum value in an array
    public static void main(String[] args) {
        int marks[] = { 95, 85, 75, 80, 65 };
        int min = marks[0];
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("\n min:" + min);
        System.out.println("\n max:" + max);
    }
}
