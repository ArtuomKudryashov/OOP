package abstract_final.Constant;

public class MonthHelper {                      // нестер класс
     private  static class N{}


    private  class I{}                   // инер класс



    private static  class Month {
         private  String name;
         private int days;

        public Month(String name, int days) {
            this.name = name;
            this.days = days;
        }

        public String getName() {
            return name;
        }

        public int getDays() {
            return days;
        }
    }
    private  static final Month[]MONTH= {
             new Month("Ja",31 ),
            new Month ("Fe", 28)
    };


    public static void main(String[] args) {
//         Main.N n= new Main.N();  // нестер класс
//
//        Main main = new Main();
//        Main.I i =main.new I ();


    }

}
