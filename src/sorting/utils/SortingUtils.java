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
     * Initialize the array using 0
     * @param arr
     * @return 
     */
    public static int[] initializeArrayWithZeros(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
}
