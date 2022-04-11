package HW_6;

public class Person {
     String name;
     char sex;
     int age;
// this is constructor - command + N
    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }


}
