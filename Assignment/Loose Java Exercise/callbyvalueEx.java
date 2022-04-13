public class callbyvalueEx {
    int a = 10;

    void call(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        callbyvalueEx eg = new callbyvalueEx();
        System.out.println("Before call by value: " + eg.a);

        eg.call(50510);
        System.out.println("After call by value: " + eg.a);
    }
}
