package sorting.utils;

import java.util.LinkedList;

/**
 *
 * @author fran
 */
public class SortingUtils {
    /**
     * 
     * @return the bigger number
     */
    public static int getBigger(int [] arr){
        //not null
        if(arr.length==0) return 0;
        else{
            //get the first
            int bigger = arr[0];
            for(int i=1;i<arr.length;i++){
                //store the bigger
                if(bigger<arr[i]){
                    bigger= arr[i];
                }
            }
            return bigger;
        }
    }
    
    /**
     * Print the array
     * @param arr 
     */
    public static void printArray(int [] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println("]");
    }

    /**
     * Insert a number in the array, and move the others numbers to right
     * @param arr   Array
     * @param position Position where you will insert the number
     * @param size Last position when you want to move numbers
     * @param value Number that you want to insert
     * @return the array modified
     */
    public static int[] insertAndMoveRight(int[] arr, int position, int size, int value){
        int nextNumber;
        int number = value;
        //increment size
        size++;
        //move the numbers
        for(int i=position; i<size;i++){
            //store the next number
            nextNumber = arr[i];
            //override the number
            arr[i]=number;
            //reset the current number
            number = nextNumber;
        }
        
        return arr;
    }
    
    /**
     * 
     * @param arr
     * @return 
     */
    public static int[][] splitArray(int[] arr){
        int middle = arr.length/2;
        int[] arrA = new int[middle];
        int[] arrB = new int[arr.length-middle];
        
        //fill up array A
        for(int i=0;i<middle;i++){
            arrA[i]=arr[i];
        }
        
        //fill up array B
        for(int i=0;i<arrB.length;i++){
            arrB[i]=arr[i+middle];
        }
        
        //Return the new arrays
        int[][] splited = { arrA, arrB };
        
        return splited;
    }
    
    /**
     * 
     * @param arrA
     * @param arrB
     * @return 
     */
    public static int[] mergeAndOrderArray(int[] arrA, int[] arrB){
        int[] arr = new int[arrA.length+arrB.length];
        
        int a = 0;
        int b = 0;
        
        for(int i=0;i<arr.length;i++){
            if(a==arrA.length){
                arr[i]=arrB[b];
                b++;
            }else if(b==arrB.length){
                arr[i]=arrA[a];
                a++;
            }else if(arrA[a]<arrB[b]){
                arr[i]=arrA[a];
                a++;
            }else{
                arr[i]=arrB[b];
                b++;
            }
        }
        
        return arr;
    }
}
