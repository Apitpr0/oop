public class MainQ2 {
    public void mul() {
        int i = 10;
        int j = 20;
        float x = i * j;
        System.out.println("Total of two= " + (x));
    }

    public void mul(int num1, int num2) {
        System.out.println("Total of two= " + (num1 * num2));
    }

    public void mul(int num1, int num2, double num3) {
        System.out.println("Total of three= " + (num1 * num2 * num3));
    }

    public static void main(String[] args) {
        MainQ2 ans = new MainQ2();
        ans.mul();
        ans.mul(30, 40);
        ans.mul(10, 20, 39.9);
    }
}
