package sorting.types;

import sorting.utils.SortingUtils;

/**
 *
 * @author fran
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example array
        int [] integerArray = new int []{3,11,2,9,1,5,5};
        boolean end = false;
        boolean noChanges;
        
        //the loop will end, when the array dont change anymore
        while(!end){
            noChanges = true;
            for(int i=1;i<integerArray.length;i++){ 
                if(integerArray[i]<integerArray[i-1]){
                    noChanges = false;
                    //store the numbers
                    int a = integerArray[i-1];
                    int b = integerArray[i];
                    //change his positions
                    integerArray[i] = a;
                    integerArray[i-1] = b;
                };
            }
            end = noChanges;
        }
        
        SortingUtils.printArray(integerArray);
    }
    
}
