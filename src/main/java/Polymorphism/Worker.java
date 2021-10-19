package Polymorphism;

public class Worker extends Person {
     Person person = new Person();
     private int salary;

     boolean isSameName(Worker employee) {
         return getName().equals(employee.getName());
     }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
