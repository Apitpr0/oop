class Over {
    void display() {
        System.out.println("Melaka");
    }

    void display(int i) {
        int j = 0;
        while (j < i) {
            System.out.println("Johor");
            j++;
        }
    }

    void display(String str, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(str);
        }
    }
}

class Poly {
    public static void main(String[] args) {
        Over obj = new Over();
        obj.display();
        obj.display(2);
        obj.display("Kuala Lumpur", 3);
    }
}