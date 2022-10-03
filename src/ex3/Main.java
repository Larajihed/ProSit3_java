package ex3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Main {



        public static void main(String[] args){
            System.out.println("Enter la taille du tableau: ");
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int myArray[] = new int [size];
            int produit = 1;
            int nbrePos = 0;
            System.out.println("Enter les elements du tableau ");
            for(int i=0; i<size; i++){
                myArray[i] = s.nextInt();
                if(myArray[i] > 0 ){
                    nbrePos++;
                }
                produit = produit * myArray[i];
            }
            System.out.println("Elements du Tableau "+ Arrays.toString(myArray));
            System.out.println("Total:"+ produit);
            System.out.println("nbre des valeurs positif:" + nbrePos);

        }
    }

