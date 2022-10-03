package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int intArray[];
        intArray = new int[3];
        Scanner s = new Scanner(System.in);

        for (int counter=0; counter<intArray.length;counter++) {
            do {
                intArray[counter]= s.nextInt();

            }while(intArray[counter]<0);
        }
        for (int counter=0; counter<intArray.length;counter++) {
            System.out.println(intArray[counter]);
        }

    }
}
