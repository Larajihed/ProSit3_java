
package ex4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //saisieTailleTableau();
        int[] arr =new int[]{85,2,3,25,5,6,7,8,9};

        //saisiTableau(arr);
        //afficherTableau(arr);
        System.out.println(index(3,arr));
    }

    public static int saisieTailleTableau() {
        Scanner s = new Scanner(System.in);
        int size = -1;
        do {
            System.out.println("Enter la taille du tableau: ");
            size = s.nextInt();
        } while (size < 0);
        int myArray[] = new int[size];
        return size;
    }

    public static void saisiTableau(int tab[]) {
        System.out.println("Enter les elements du tableau ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = s.nextInt();
        }
    }

    public static void afficherTableau(int tab[]){
            System.out.println(Arrays.toString(tab));
    }

    public static double calculMoyen(int tab[]){
        int sum=0;
        for (int i=0; i< tab.length;i++){
            sum += tab[i];
        }
        return (sum/tab.length);
    }

    public static int min(int tab[]){
        int min = tab[0];
        for (int i=1; i<tab.length-1;i++){
            if( tab[i]<min){
                min=tab[i];
            }
        }
        return min;
    }

    public static int max(int tab[]){
        int max = tab[0];
        for (int i=1; i<tab.length-1;i++){
            if( tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }

    public static boolean doesExist(int x, int tab[]){
        boolean doesExist=false;
        for (int i=0; i<tab.length;i++){
            if(x==tab[i]){
                return true;
            }
        }
        return false;
    }

    public static int index(int x, int tab[]){
        int index;
        for (int i=0; i<tab.length;i++){
            if(x==tab[i]){
                index=i;
                return index;
            }
        }
        return -1;
    }



}


