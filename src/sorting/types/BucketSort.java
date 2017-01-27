package sorting.types;

import sorting.utils.SortingUtils;

/**
 *
 * @author fran
 */
public class BucketSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example array
        int [] integerArray = new int []{3,11,2,9,1,5,5};
        
        //we need the maximum value, then we create an array with the same length as the maximum
        int bigger = SortingUtils.getBigger(integerArray);
        int[] weightArray = new int[++bigger];
        
        weightArray = SortingUtils.initializeArrayWithZeros(weightArray);

        //Array with the numbers of replays of each number
        for(int i=0;i<integerArray.length;i++){
            //increment the weight of the current position
            weightArray[integerArray[i]]++;
        }

        //get the total weight sum, then create an array with the output
        int sum = 0;
        for(int i=0;i<weightArray.length;i++){
            sum+=weightArray[i];
        };
        
        //Array with output result
        int[] output = new int[sum];
        int outPosition = 0;
        for(int i=0; i<weightArray.length;i++){
            for(int j=0;j<weightArray[i];j++){
                output[outPosition]=i;
                outPosition++;
            }
        }
        
        //Prints array
        SortingUtils.printArray(output);
    }
    
}
