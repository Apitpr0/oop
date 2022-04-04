class Activity1 {
    public static void main(String args[]) {
        int n = Integer.parseInt("10");
        System.out.println("The cube of " + n + " is " + cube(n));
    }

    static float cube(int n) {
        return (n * n * n);
    }
}
