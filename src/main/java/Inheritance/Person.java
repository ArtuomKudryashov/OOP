package Inheritance;


public class Person {

    static  String tag;
    static int count;
    static  int count3;

    String name;
    int  age;
    char gender;



    void printPerson() {
        System.out.print("name: " + name);
        System.out.print(", age: " + age);
        System.out.print(", gender: " + gender);
    }
    static void printPerson1(String name, int age, char gender) {
        System.out.print("name: " + name);
        System.out.print(", age: " + age);
        System.out.print(", gender: " + gender);
    }
}
