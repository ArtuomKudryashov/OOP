package hw12_13;

public class Director extends Manager {

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates () == 0) {
            return super.getSalary();
        } else {
            return  super.getBaseSalary() * (getNumberOfSubordinates()/100*9);
        }
    }
}
