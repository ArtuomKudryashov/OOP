package abstract_final.Constant;

public class Director extends Manager {
    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates () == 0) {
            return super.getSalary();
        } else {
            return  super.getBaseSalary() * (getNumberOfSubordinates()/100*9);
        }
    }
}
