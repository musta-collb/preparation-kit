package GoogleKit;

import java.util.Arrays;

/**
 * Given tow sorted Arrays find the median if the result array if we merge them together
 * time constraint : O(n+m)
 * n: the size of the first array
 * m: the size of the second array
 * Definition: the median is the element in the middle of the sorted array if its size is an odd number
 * otherwise it's the sum of the two elements in the middle divided on a half
 * Ex: the middle of [1,3,5,6,7] is 5
 *     the middle of [1,3,6,7] is (3+6)/2 = 4.5
 *
 */
public class MediamOfToSortedArraysSolution {
    /**
     * The idea is to merge the two arrays into one array then decide the median
     * @param arr1
     * @param arr2
     * @return
     */
    public static double findSolution(int[] arr1, int[] arr2){
        int[] nums = new int[arr1.length+arr2.length];
        int indexNum = 0;
        int arr1Index = 0;
        int arr2Index = 0;
        while (arr1Index < arr1.length && arr2Index < arr2.length){
            if(arr1[arr1Index] == arr2[arr2Index]){
                nums[indexNum] = arr1[arr1Index];
                indexNum++;
                nums[indexNum] = arr2[arr2Index];
                arr1Index++;
                arr2Index++;
                indexNum++;
                continue;
            }
            if(arr1[arr1Index] < arr2[arr2Index]){
                nums[indexNum] = arr1[arr1Index];
                arr1Index++;
                indexNum++;
                continue;
            }
            if(arr2[arr2Index] < arr1[arr1Index]){
                nums[indexNum] = arr2[arr2Index];
                arr2Index++;
                indexNum++;
                continue;
            }

            //indexNum++;
        }
        while (arr1Index < arr1.length){
            nums[indexNum] = arr1[arr1Index];
            arr1Index++;
            indexNum++;
        }
        while (arr2Index < arr2.length){
            nums[indexNum] = arr2[arr2Index];
            arr2Index++;
            indexNum++;
        }
        System.out.println(Arrays.toString(nums));
        if(nums.length %2 == 0){
            return (nums[nums.length/2]+ nums[nums.length/2 - 1])/2 ;
        } else {
            return nums[nums.length/2];
        }
        //return 0.1;
    };
}
