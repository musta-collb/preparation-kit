package GoogleKit;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubStringWithoutRepeatingCharTest {
    @Test
    public void test1(){
        Assert.assertEquals(LongestSubStringWithoutRepeatingCharSolution.findSolution("abcabcbb"), 3);
        Assert.assertEquals(LongestSubStringWithoutRepeatingCharSolution.findSolution("bbbbb"), 1);
        Assert.assertEquals(LongestSubStringWithoutRepeatingCharSolution.findSolution("pwwkew"), 3);
    }
}
