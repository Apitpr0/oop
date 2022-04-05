class Reference {
    public static void main(String args[]) {
        int[] arr = { 5, 7 };
        System.out.println("Before calling the method: ");
        System.out.println("arr[0]=" + arr[0]);
        System.out.println("arr[1]=" + arr[1]);
        change(arr);
        System.out.println("After calling the method: ");
        System.out.println("arr[0]=" + arr[0]);
        System.out.println("arr[1]=" + arr[1]);
        System.out.println("This is pass by reference");
    }

    static void change(int[] num) {
        num[0] = 2;
        num[1] = 3;
    }
}