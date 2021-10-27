package Test;

public class Arr {
    public static void main(String[] args) {


    int [] mini= {5,4,3,9,10,-5,16,-100} ;
    int min = mini [0];
        for (int i  =0; i < mini.length; i++){
            if (min > mini [i]){
                min = mini[i];
            }

        }
        System.out.println(min);





    }

}
