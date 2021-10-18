package Inheritance;

import Person.Person;
import Person.Worker;

public class Test {
    public static void main(String[] args) {




        Person person= new Person("Sergey",30, 'M');

        System.out.println(person.getName());

        person.setName("Sergey2");

        System.out.println(person.getName());





    }
}
