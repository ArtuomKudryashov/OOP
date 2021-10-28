package Test2;

import abstract_final.Constant.Employee;

public class Salay_dif {
    public static int getSalarymin( Employee[] array) {
        int resmin = array[0].getSalary();
        int resmax = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if(resmin>array[i].getSalary()){
                resmin=array[i].getSalary();
            } if (resmax < array[i].getSalary()) {
                resmax = array[i].getSalary();
            }
            return resmax;


        }
        return resmin;



    }
    public static int getSalarymax( Employee[] array) {
        int resmax = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (resmax < array[i].getSalary()) {
                resmax = array[i].getSalary();
            }

        }
        return resmax;
    }
}
