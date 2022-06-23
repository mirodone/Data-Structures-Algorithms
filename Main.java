package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //int [] numbers = new int[3];
       // String []  letters = new String[4];
        //System.out.println(Arrays.toString(letters));

        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(33);
        numbers.insert(44);
        numbers.insert(6);

    // numbers.removeAt(3);
      //numbers.removeAt(0);



       // System.out.println(numbers.indexOf(55));


        numbers.print();
        numbers.reverse();
        numbers.max();


    }
}
