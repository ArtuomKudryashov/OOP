package Static;


public class Person {

    static  String tag;
    static int count;

    String name;
    int  age;
    char gender;

    public  Person(String name) {
        this.name = name;
        count++;
    }


    Person (String name, int age, char gender){
        this ( name);

        this.age = age;
        this.gender = gender;
    }

    void printPerson() {
        System.out.println("name: " + name);
        System.out.println(", age: " + age);
        System.out.println(", gender: " + gender);
    }
    static void printPerson1(String name, int age, char gender) {
        System.out.print("name: " + name);
        System.out.print(", age: " + age);
        System.out.print(", gender: " + gender);
    }
}
