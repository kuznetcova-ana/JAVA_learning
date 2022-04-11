package HW_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anastasia",'F', 25);
        Person person2 = new Person("Slava",'M', 45);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        Employee[] employees = {new Employee("Anastasiia",'F', 25, 75000),
                                new Employee("Oleg",'M', 45, 35000),
                                new Employee("Karl",'M', 22, 65930)};


        Salary salary = new Salary();
        System.out.println("Sum of salaries = " + salary.getSum(employees));







    }

}
