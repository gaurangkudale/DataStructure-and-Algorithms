package Arrays;
import java.util.*;
public class Main {
    //6. Write a Java program to find the index of an array element.
    public static int indexValue(int arr[], int target){
        if(arr == null){
            return -1;
        }
        int x = arr.length;
        int i = 0;
        //Using while loop
        // while(i<x){
        //     if(arr[i]==target){
        //         return i;
        //     }
        //     else i=i+1;
        // }


        //Using for Loop
        int j;
        for( j = 0;i <arr.length;j++){
            if(arr[j]==target){
                break;
            }
        }
        return j;
    }

   // 9. Write a Java program to insert an element (specific position) into an array.
    public static int insert(int arr[], int possition,int newValue){
        if(arr == null){
            return -1;
        }
        for(int i = possition; i<arr.length;++i){
           return arr[i] = newValue;
        }
        return -1;
    }

    //10. Write a Java program to find the maximum and minimum value of an array
    static int max;
    static int min;

    public static int maxValue(int arr[]){
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));

        for(int i= 0;i<arr.length;i++){
            return arr[arr.length-1];
        }
        return -1;
    }
    public static int minValue(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            return arr[0];
        }
        return -1;
    }

    //11. Write a Java program to reverse an array of integer values.
    
    public static void reverse(int arr[]){
            for( int j = arr.length-1; j >= 0; j--){
                System.out.print(" "+arr[j]);
            }
        
    }

    //12. Write a Java program to find the duplicate values of an array of integer values.
    static int i,j;
    public static void duplicate(int arr[],int value){
        // 
        for( i =0; i<=arr.length-1; i++){
            for(j= i+1; j<=arr.length-1;j++){
                if(arr[i]==arr[j] ) {
                    System.out.println("First approch :"+arr[j] + " ");
                    }
                }
            }
            System.out.println("----------------------");
 
            Arrays.sort(arr);
            System.out.println("Sorted Arrays : " +Arrays.toString(arr));
            for(i=0; i< arr.length-1;i++){
                if(arr[i] == arr[i+1]){
                    System.out.println("Second Approch :"+arr[i]+" ");
                }
            }
        }

    
    

    public static void main(String [] args){
        int z[] = {1,5,220,7,5,2,5,98,55,44,0,2,7};
        int b[] = {1,7,8,7,2,4,9,2};
        int target = 44;
        int newValue = 2;
        
       
       //duplicate(z,5);
        // reverse(z);
        //System.out.println(maxValue(z));
       // System.out.println(minValue(z));

        // System.out.println(insert(z,0,10));
        // System.out.println(Arrays.toString(z));

       // System.out.println(indexValue(z,target));

        //7. Write a Java program to remove a specific element from an array.
        int a [] = {14,7,8,5,2,11,55,44};
        int remove = 2;

        for(int i = remove; i< a.length-1;i++){
            a[i] = a[i+1];
        }
       // System.out.println(Arrays.toString(a));

        //8. Write a Java program to copy an array by iterating the array.
        int ar[] = {1,2,3,4,5};
        int my_arr[] = new int[5];

        for(int i = 0; i<ar.length;i++){
            my_arr[i] = ar[i];
        }
        //System.out.println(Arrays.toString(my_arr));

    }
}
