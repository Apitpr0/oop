class Shape {
    public double getArea() {
        return 0;
    }

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape Color = " + color + " ";
    }
}

class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle [Length = " + length + " and Width = " + width + ", " + super.toString() + "]";
    }

    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Triangle [Base = " + base + " and Height = " + height + ", " + super.toString() + "]";
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape s2 = new Triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());

    }
}