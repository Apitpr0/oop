/*To convert Fahrenheit into Centigrade and vice versa using overridden methods */
class Centigrade {
    double f, c;

    void convert(double num) {
        this.f = num;
        c = (f - 32.0) * 5.0 / 9.0;
        System.out.println("The temperature in centigrade is " + c);
    }
}

class Fahrenhiet extends Centigrade {
    void convert(double num) {
        this.c = num;
        f = 9.0 / 5.0 * c + 32.0;
        System.out.println("The temperature in fahrenhiet is " + f);
    }
}

class MtdOveride {
    public static void main(String args[]) {
        Centigrade obj1 = new Centigrade();
        Fahrenhiet obj2 = new Fahrenhiet();
        obj1.convert(98);
        obj2.convert(36.66);
    }
}