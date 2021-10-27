package Test2;

import hw12_13.Manager;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Artuom", 37, 10000);
        Employee employee1 = new Employee("Veranika", 35, 156000);
        Employee employee2 = new Employee("Veranika", 38, 100);
        Employee employee3 = new Employee("Veranika", 33, 150500);
        Employee employee4 = new Employee("Veranika", 30, 150030);



        employee1.setSalary(56000);
        System.out.println(employee1.getSalary());

        employee.setName("Tima");
        System.out.println(employee.getName()+", "+employee1.getSalary()+employee.getName());



        System.out.println(employee.getSalary());
        Salary salary = new Salary();

        Employee [] salary1={employee,employee1,employee2,employee3,employee4};



        System.out.println();
        int min =salary1[0].getSalary();
        System.out.println(min);
        for (int i =0; i< salary1.length; i++){
            if(min>salary1[i].getSalary()){
                min=salary1[i].getSalary();
            }

        }
        System.out.println(min);


    }





}


