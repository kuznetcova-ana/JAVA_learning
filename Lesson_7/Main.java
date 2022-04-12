package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anastasia", 25,'F');
        Person p2 = new Person("Anna", 20,'F');

        Person[] personArray = {p1,p2};

        Person pMin = PersonHelper.getMinAge(personArray);
        System.out.println(p1.getName());

    }
}
