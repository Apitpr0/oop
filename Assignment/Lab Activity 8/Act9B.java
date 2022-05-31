interface Person {
    public String getName();
}

class Student implements Person {
    String name = "Amirul";

    public String getName() {
        System.out.println("Student Name:" + name);
        return name;
    }
}

class Employee implements Person {
    String name = "Amirul";

    public String getName() {
        System.out.println("Employee Name:" + name);
        return name;
    }
}

public class Act9B {
    public static void main(String[] args) {
        String temp;

        Student studentObject = new Student();
        Person ref = studentObject;
        Person ref2 = new Student();

        Employee employeeObject = new Employee();
        Person ref3 = employeeObject;
        Person ref4 = new Employee();

        System.out.println("getName() method of Student class is called");
        temp = ref.getName();
        System.out.println(temp);
        // Person ref. points to an Employee object
        ref = employeeObject;
        System.out.println("getName() method of Employee class is called");
        temp = ref3.getName();
        System.out.println(temp);
    }
}