abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    double panjang;
    double lebar;

    void area() {
    }

    double area(double panjang, double lebar) {
        double area = panjang * lebar;
        return area;
    }
}

class Square extends Shape {
    double panjang;
    double lebar;

    void area() {
    }

    double area(double panjang, double lebar) {
        double area = panjang * lebar;
        return area;

    }
}

public class shapeCalc {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square squ = new Square();
        System.out.println(rec.area(6.0, 5.0));
        System.out.println(squ.area(6.0, 5.0));

    }
}
