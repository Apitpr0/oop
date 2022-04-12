public class sumofarray {
    public static void main(String[] args) {
        int[] checkedArray = { 5, 2, 7, 9, 6 };
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + checkedArray[i];
        }
        System.out.println("The sum of the array is " + sum);
    }
}
