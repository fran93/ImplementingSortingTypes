package sorting.types;

import sorting.utils.SortingUtils;

/**
 *
 * @author fran
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example array
        int [] integerArray = new int []{3,11,2,9,1,5,5};
        int [] outputArray = new int[integerArray.length];
        
        //iterate the array, and insert the numbers in order in the new array
        for(int i=0;i<integerArray.length;i++){
            boolean inserted = false;
            for(int j=0;!inserted && j<i;j++){
                //when the value is lower that the current element, insert the element in that position
                if(integerArray[i]<outputArray[j]){
                    //insert the number and move the others numbers  //i actually second array size
                    outputArray = SortingUtils.insertAndMoveRight(outputArray, j, i, integerArray[i]);
                    //end the loop
                    inserted = true;
                }
            }
            //if you didnt insert the number, insert him in the last position
            if(!inserted) outputArray[i]=integerArray[i];
        }
        
        SortingUtils.printArray(outputArray);
        
    }
    
}
