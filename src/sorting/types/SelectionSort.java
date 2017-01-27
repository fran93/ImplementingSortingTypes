package sorting.types;

import sorting.utils.SortingUtils;

/**
 *
 * @author fran
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example array
        int [] integerArray = new int []{3,11,2,9,1,5,5};
        
        for(int i=0;i<integerArray.length;i++){
            int minPos = i;
            //find the smallest
            for(int j=i;j<integerArray.length;j++){
                if(integerArray[minPos]>integerArray[j]){
                    minPos=j;
                }
            }
            //change positions
            int a = integerArray[i];
            int b = integerArray[minPos];
            integerArray[minPos]=a;
            integerArray[i]=b;
        }
        
        SortingUtils.printArray(integerArray);
    }
    
}
