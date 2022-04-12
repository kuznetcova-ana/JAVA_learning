package Lesson_7;

public class Person {
    private String name;
    private int age;
    private char gender;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName() {
        if (gender == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    Person getMinAge(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age < arr[i].age) {
                min = arr[i];
            }
        }
        return min;
    }

}

