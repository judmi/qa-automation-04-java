package hw_6;

public class Employee {
    String name;
    int age;
    char sex;
    int salary;

    Employee (String name, int age, char sex, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    boolean isSameName (Employee employee) {
        return (employee.name.equals(this.name));
    }
}
