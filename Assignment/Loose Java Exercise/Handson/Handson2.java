public class Handson2 {
    public static void main(String args[]) {
        // Declare Variable
        int A = 5;
        int B = 7;
        System.out.println("Before calling the method: ");
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        change(A, B);
        System.out.println("After calling the method: ");
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("\nThis is pass by value");
    }

    static void change(int A, int B) {
        A = 2;
        B = 3;
        return;
    }
}
