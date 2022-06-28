public class Person {
    String name;
    int age;
    float salary;

    Person(String p_name, int p_age, float p_salary) {
        name = p_name;
        age = p_age;
        salary = p_salary;
    }

    public void displayData() {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);
    }

    public static void main(String[] args) {
        Person p = new Person("Afiq", 18, 5000.5F);
        p.displayData();
    }
}
