abstract class Shape { // Abstract class
    abstract void draw(); // Abstract method
}

class Triangle extends Shape { // sub class Rectangle
    void draw() {
        System.out.println("Drawing Triangle");
        // Abstract method implemeted in a subclass
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
        // Abstract method implemeted in a subclass
    }
}

class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Triangle();
        Shape c = new Circle1();
        s.draw();
        c.draw();
    }
}
