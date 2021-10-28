package abstract_final.Constant;

public class App {
    public static void main(String[] args) {

        Worker worker =new Worker(10000, "Artuom");
        Manager manager = new Manager(12000,"Ivan",9);
        Manager manager2 = new Manager(12000,"Ivan6",8);
        Manager manager3 = new Manager(12000,"David",14);
        Director director = new Director(12000,"Anna",3);


        Worker [] workers = {worker, manager, director};

//        Manager [] managers ={manager, director,};

        Manager [] managers2 = {manager,manager2,manager3};



        System.out.println(
                EmployeeHelper.findByName("Artuom",workers).getName()
        );
        System.out.println(
                EmployeeHelper.findBySubName("va",workers).getName()
        );
        System.out.println(
                EmployeeHelper.getMinSubordinates(managers2).getName()

        );
        System.out.println(
                EmployeeHelper.getMinSubordinates2(managers2));
//
//
//        System.out.println(
//                  EmployeeHelper.findBySubName("Ann",workers).getName()
//        );


    }
}
