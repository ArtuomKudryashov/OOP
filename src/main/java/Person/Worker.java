package Person;

import Person.Person;

public class Worker extends Person {

    int salary;


    public Worker(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }
}
