package sorting.types;

import java.util.LinkedList;
import sorting.utils.SortingUtils;

/**
 *
 * @author fran
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example array
        int [] integerArray = new int []{3,11,2,9,1,5,5};
        
        //add the array to the linked list
        LinkedList<int[]> arrays = new LinkedList();
        arrays.add(integerArray);
        
        //split the array, util there is only 1 element in each array        
        while(arrays.size()<integerArray.length){
            int actualSize = arrays.size();
            for(int i=0;i<actualSize;i++){
                //dont split a 1 size array
                if(arrays.get(i).length>1){
                    //split
                    int[][] splitArray = SortingUtils.splitArray(arrays.remove(i));
                    //store the new arrays
                    arrays.add(splitArray[0]);
                    arrays.add(splitArray[1]);
                }
            }
        }

        //join the arrays
        while(arrays.size()>1){
            arrays.addLast(SortingUtils.mergeAndOrderArray(arrays.removeFirst(), arrays.removeFirst()));
        }
        
        SortingUtils.printArray(arrays.get(0));

    }
    
}
