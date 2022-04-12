package Lesson_7;

public class PersonHelper {
    static String name;
    static Person getMinAge(Person[] arr) {
        Person min = null;
        for (int i = 0; i < arr.length; i++) {
            if (min == null || min.age < arr[i].age) {
                min = arr[i];
            }
        }
        return min;
    }
}
