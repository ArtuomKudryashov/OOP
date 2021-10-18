package Static;

public class Test {
    public static void main(String[] args) {

        Person a = new Person("Sergey");
        a.name = "Sergey1";

        //static- Принадлежит классу, не объекту.
        a.tag = "Sergey2";
//        Person.tag

        Person b = new Person("Anna");
        b.name = "Anna1";
        b.tag = "Anna2";

        Person c = new Person("Artuom");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a.tag);
        System.out.println(b.tag);
        System.out.println(Person.count);

        Person.printPerson1("Devid",25,'M');
    }
}
