package hw_6;

public class Person {
    String name;
    int age;
    char sex;

    String getName() {
        if (this.sex == 'F') {
            return "Mrs.";
        } else if (this.sex == 'M') {
            return "Mr.";
        } else {
            return null;
        }
    }
}
