package Arrays;

import java.util.Arrays;

public class Solution {
    //1. Write a Java program to sort a numeric array and a string array
    public static void main(String [] args){
        int a [] = {115,445,468,564,643,408,488,432,111};
        String s [] = {"oa","eb","cef","ds","eds","aaa"};

        Arrays.sort(a);
        Arrays.sort(s);
        // System.out.println("Sorted integer arrays are : "+Arrays.toString(a));
        // System.out.println("Sorted String arrays are : "+Arrays.toString(s));

    //2. Write a Java program to sum values of an array.
        int b[] = {5,7,9,4,6,10};
        int sum =0;
        for(int i: b){
            sum += i;
           // System.out.println("The Sum is : "+sum);
        }

    //3. Write a Java program to print the following grid.
        int arr [][] = new int[10][10];
        int num = arr.length;
        for(int i =0; i<num;i++){
            for(int j=0; j<num; j++){
            //    System.out.printf("%d",arr[i][j]);
            }
           // System.out.println();
        }

    //4. Write a Java program to calculate the average value of array elements.
        int array[] = {14,55,7,86,55,47,22,40};
        int numbs = array.length;
        int x1 = 0;
        for(int i =0; i<numbs;i++){
            x1 = x1 + array[i];
            int avg = x1/numbs;
        //    System.out.println(x1);
        //    System.out.println("Avrage of an array is :" + avg);
        }


    //5. Write a Java program to test if an array contains a specific value.
        int arr1[] = {1,5,7,4,6,3,80};
        int target = 80;

        for(int i =0; i <arr1.length; i++){
            if(arr1[i]== target){
                System.out.println(arr1[i]);
                
            }
            System.out.println("value fount at index number :"+ arr1[i]);
        }

    }
}
