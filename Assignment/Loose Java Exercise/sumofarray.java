public class sumofarray {
    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 9, 6 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the array is " + sum);
    }
}
