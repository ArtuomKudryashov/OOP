package Polymorphism;

public class Salary {
    public  static int getSum(Worker[] workersArray) {
        int sum = 0;
        for (int i = 0; i < workersArray.length; i++) {
            sum += workersArray[i].getSalary();
        }
        return  sum;
    }
}
