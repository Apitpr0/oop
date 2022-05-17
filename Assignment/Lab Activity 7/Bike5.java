class Vehicle {
    int speed;

    Vehicle(int speed1) {
        speed = speed1;
        System.out.println("Vehicle is created" + speed);
    }
}

class Bike5 extends Vehicle {
    Bike5() {
        super(50);
        System.out.println("Bike is created");
    }

    public static void main(String args[]) {
        Vehicle v = new Vehicle(100);
        Bike5 b = new Bike5();

    }
}