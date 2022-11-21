package GoogleKit;

import org.junit.Assert;
import org.junit.Test;

public class MediamOfTowSortedArraysTest {
    @Test
    public void testSolution(){
        int[] arr1 = {1, 3, 6};
        int[] arr2 = {6,7};
        Assert.assertEquals(MediamOfToSortedArraysSolution.findSolution(arr1, arr2), 6, 0);
    }
    @Test
    public void testSolution2(){
        int[] arr1 = {1, 3, 6};
        int[] arr2 = {6,7,8};
        Assert.assertEquals(MediamOfToSortedArraysSolution.findSolution(arr1, arr2), 6, 0);
    }
}
