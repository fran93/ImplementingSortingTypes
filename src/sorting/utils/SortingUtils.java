package sorting.utils;

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
}
