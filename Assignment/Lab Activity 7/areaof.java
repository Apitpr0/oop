class Shape {
    String color;
}

class Rectangle extends Shape {
    void getArea(int length, int width) {
        System.out.println("Length of rectangle:" + length);
        System.out.println("Width of rectangle:" + width);
        int area = length * height;
        System.out.println("Area is " + area);
    }

    class Triangle extends Shape {
        void getArea(int base, int height) {
            System.out.println("Base of triangle:" + base);
            System.out.println("Height of triangle:" + height);
            int area = (base * height) / 2;
            System.out.println("Area is " + area);
        }
    }

    class areaof {
        public static void main(String[] args) {
            Rectangle obj1 = new Rectangle();
            Triangle obj2 = new Triangle();
            obj1.getArea(5, 4);
            obj2.getArea(5, 4);
        }
    }
}