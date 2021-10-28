package abstract_final.Constant;

public class EmployeeHelper {
//    поиск сотрудника в массиве по его имени

    public static Employee findByName(String name, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static Employee findBySubName(String subName, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;
    }

    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getSalarySum(Employee[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getSalary();

        }

        return result;
    }
//    поиск наименьшей зарплаты в массиве

    public static int getSalarymin(Employee[] array) {
        int resmin = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (resmin > array[i].getSalary()) {
                resmin = array[i].getSalary();
            }

        }
        return resmin;
    }
//    поиск наибольшей зарплаты в массиве


    public static int getSalarymax(Employee[] array) {
        int resmax = array[0].getSalary();
        for (int i = 0; i < array.length; i++) {
            if (resmax < array[i].getSalary()) {
                resmax = array[i].getSalary();
            }

        }
        return resmax;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager getMinSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager minCount = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minCount.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                minCount = array[i];
            }

        }
        return minCount;

    }
    // //поиск наименьшего количества подчиненных в массиве менеджеров 2 версия
    public static int getMinSubordinates2(Manager[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Manager minCount = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minCount.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                minCount = array[i];
            }

        }
        return minCount.getNumberOfSubordinates();
    }





    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static Manager getMaxSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Manager maxCount = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxCount.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                maxCount = array[i];
            }

        }
        return maxCount;
    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static Manager getMaxDiference(Manager[] array) {

        Manager maxCount = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxCount.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                maxCount = array[i];
            }

        }
        return maxCount;
    }

    public static int getMinDiff(Manager[] managers) {
        int minBenefits = managers[0].getSalary() - managers[0].getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            int diff = managers[i].getSalary() - managers[i].getBaseSalary();
            if (minBenefits < diff) {
                minBenefits = diff;
            }
        }
        return minBenefits;
    }

    public static int getMaxDiff(Manager[] managers) {
        int maxBenefits = managers[0].getSalary() - managers[0].getBaseSalary();
        for (int i = 1; i < managers.length; i++) {
            int diff = managers[i].getSalary() - managers[i].getBaseSalary();
            if (maxBenefits > diff) {
                maxBenefits = diff;
            }
        }
        return maxBenefits;
    }


}
