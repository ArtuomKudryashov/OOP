package Polymorphism;

public class Manager extends Worker {

    private  int countOfWorker;

    public int getCountOfWorker() {
        return countOfWorker;
    }

    public void setCountOfWorker(int countOfWorker) {
        this.countOfWorker = countOfWorker;
    }
    public  int getSalary() {
        return super.getSalary()+ super.getSalary() /100 * getCountOfWorker();
    }
}
