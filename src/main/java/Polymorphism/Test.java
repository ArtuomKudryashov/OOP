package Polymorphism;

public class Test {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setCountOfWorker(10);
        manager.setSalary(100000);

        System.out.println(manager.getSalary());
    }
}
