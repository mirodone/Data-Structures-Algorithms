package ro.mirodone;


import java.util.Arrays;

public class Array {


    private int[] myArray;

    private int count;


    Array(int arrayDimension) {
        myArray = new int[arrayDimension];
    }

    void insert(int item) {

        //If the array is full, resize it
        if (myArray.length == count) {

            //Create a new  array ( double the size)
            int[] newArray = new int[count * 2];

            //Copy all the existing items
 /*           for (int i = 0; i < count; i++)
                newArray[i] = myArray[i];*/

            System.arraycopy(myArray, 0, newArray, 0, count);

            //Set items from "myArray" to the new array

            myArray = newArray;
        }
        //Add the new item at the enf
        myArray[count] = item; // myArray[count++] = item;
        count++;
    }


    public void removeAt(int index) {
        // System.out.println(count+ " count la inceput removeAt");

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            myArray[i] = myArray[i + 1];

        count--;
        //System.out.println(count+ " count la sfarsit removeAt");
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (myArray[i] == item)
                return i;
        }
        return -1;
    }

    public void reverse( ) {

         int a[] =myArray;
       int  n=count;

        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }


    public void max(){

        int max;
        max = Arrays.stream(myArray).max().getAsInt();
        System.out.println("Largest in given array is " +max);

    }

    public void print() {

        // System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < count; i++) {
            System.out.println(myArray[i]);
        }

        //System.out.println(myArray.length);
    }


}