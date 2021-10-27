package hw12_13;

import hw12_13.Employee;

public class EmployeeHelper {
//    поиск сотрудника в массиве по его имени

    public static Employee findByName (String name, Employee[] array){
        for (int i = 0; i < array.length; i++){
            if (name.equals(array[i].getName())){
                return array[i];
            }
        }
        return null;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static Employee findBySubName (String subName, Employee[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i].getName().contains(subName)){
                return array[i];
            }
        }
        return null;
    }
//    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getSalarySum( Employee[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
          result +=array[i].getSalary();

            }

        return result;
    }
//    поиск наименьшей зарплаты в массиве

    public static int getSalarymin( Employee[] array) {
        int resmin = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if(resmin>array[i].getSalary()){
                resmin=array[i].getSalary();
            }

        }
        return resmin;
    }
//    поиск наибольшей зарплаты в массиве


    public static int getSalarymax( Employee[] array) {
        int resmax = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (resmax < array[i].getSalary()) {
                resmax = array[i].getSalary();
            }

        }
        return resmax;
    }
    public static Manager getMinSubordinates( Manager[] array) {
        if(array == null || array.length == 0){
            return  null;
        }
        Manager minCount = array [0];
        for (int i = 0; i < array.length; i++) {
            if (minCount.getNumberOfSubordinates()> array[i].getNumberOfSubordinates()) {
                minCount = array[i];
            }

        }
        return minCount;
    }
    public static Manager getMaxSubordinates( Manager[] array) {
        if(array == null || array.length == 0){
            return  null;
        }
        Manager maxCount = array [0];
        for (int i = 0; i < array.length; i++) {
            if (maxCount.getNumberOfSubordinates()> array[i].getNumberOfSubordinates()) {
                maxCount = array[i];
            }

        }
        return maxCount;
    }



}
