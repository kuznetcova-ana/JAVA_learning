package HW_6;

public class Employee {
    String name;
    char sex;
    int age;
    int salary;

    public Employee(String name, char sex, int age, int salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    boolean isSameName(){
        return true;
    }
}
