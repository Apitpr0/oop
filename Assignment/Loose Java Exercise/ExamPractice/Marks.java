public class Marks {
    int mark1 = 100;
    int mark2 = 69;
    int mark3 = 99;
}

class Total extends Marks {
    void calcTotal() {
        int totMark = mark1 + mark2 + mark3;
        System.out.println(totMark);
    }

    public static void main(String[] args) {
        Total to1 = new Total();
        to1.calcTotal();
    }
}
