package abstract_final.Constant;

public  class Worker extends Employee {
    public Worker(int baseSalary, String name) {
        super(baseSalary, name);


    }
 //Если мы наследуем от абстрактного класса или там есть хотя-бы один абстрактный метод
    // этот класс тоже должен быть абстрактный поэтому переопределяем BaseSalary;
    @Override
    public int getSalary() {

//        MonthHelper.Month m =new MonthHelper.Month("",10);
        return getBaseSalary();
    }
}

