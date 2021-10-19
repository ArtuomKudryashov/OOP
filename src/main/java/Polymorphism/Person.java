package Polymorphism;

public class Person {
    private  String name;
    private int age;
    private char gender;

    String getName(){
        if (gender=='M'){
            return  "Mr. " +name;

        } else {
            return "Mrs." +name;

        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
