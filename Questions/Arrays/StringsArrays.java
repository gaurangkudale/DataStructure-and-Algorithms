package Arrays;

public class StringsArrays {

//  13. Write a Java program to find the duplicate values of an array of string values. 
    // static int j;// First approch
    // public static String duplicateOfString(String str[]){
    //     for(j=0;j< str.length-1;j++){
    //         if(str[j]==str[j+1]){}
    //     }
    //     return str[j];    
    // }

    //Second Approch
    public static void duplicateOfString2(String str[]){
        for(int i =0; i< str.length-1;i++){
            for(int j=i+1; j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[j]);
                }
            }
        }//return str[j];
    }

//  14. Write a Java program to find the common elements between two arrays (string values).

    public static void commonElement(String str1[],String str2[]){
        for(int i=0; i < str1.length; i++){
           // String s1 = str1[i];
            for(int k=0; k<str2.length; k++){
                //String s2 = str2[k];
                if(str1[i] == str2[k]){
                    System.out.print(" "+str2[k]);
                }
            }

        }

    }
// 15. Write a Java program to find the common elements between two arrays of integers.

    public static void commonInteger(int [] arr1, int[] arr2){
        for(int i =0; i< arr1.length; i++){
            for(int j =0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                System.out.print(" "+ arr2[j]);}
            }
        }
    }

// 16. Write a Java program to remove duplicate elements from an array.

    

    
    public static void main(String [] args){
        String [] string1 = {"abc","def","ghi","jlm","abc"};
        String [] string2 = {"abcw","dewf","ghi","jlm","abdc"};
        int [] x = {1,4,9,6,5,8,54};
        int [] y = {11,4,92,36,54,8};


        //duplicateOfString2(string1);
        //commonElement(string1,string2);
        //commonInteger(x,y);
    }
}
