public class Person {
    String name;
    int age;
// constructor - special method
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
// void - if we do not have return
    void printObject(){
        // this - referred to class we created
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
