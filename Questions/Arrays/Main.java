package Arrays;

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

    public static void main(String [] args){
        int z[] = {1,5,220,7,5,2,5,98,55,44};
        int target = 44;

        System.out.println(indexValue(z,target));

        //7. Write a Java program to remove a specific element from an array.
        
    }
}
