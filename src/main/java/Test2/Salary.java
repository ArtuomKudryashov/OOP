package Test2;

public class Salary {
    int  getSum (Employee[] employeeArray){
        int s = 0;
        for (int i = 0; i< employeeArray.length;i++){
            s += employeeArray[i].getSalary();



        }
        return s;
    }

}
