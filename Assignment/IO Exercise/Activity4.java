class Activity4 {
    public static void main(String args[]) {
        int n = Integer.parseInt("5");
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

    static int factorial(int no) {
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
