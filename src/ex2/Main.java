package ex2;

public class Main {
     public static void main(String[] args){
        int[] arr =new int[]{1,2,3,25,5,6,7,8,9};
        findMax(arr);
     }

     public static void findMax(int[] arr){

        int max= arr[1];
        int indice=0;

         for (int counter=0; counter<arr.length;counter++){
            if(arr[counter]>max){
                max=arr[counter];
                indice = counter;
            }else{
                counter++;
            }
         }
         System.out.println("Max Value = " + max + " D'indice = " + indice );
     }

}
