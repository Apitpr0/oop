class Shape {
    public void draw() {
        System.out.println("uwu");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("uwuww");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("uwudad");
    }
}

class Shapes {
    public static void main(String[] args) {
        Shape a = new Square();
        Shape b = new Circle();
        a.draw();
        b.draw();
    }
}