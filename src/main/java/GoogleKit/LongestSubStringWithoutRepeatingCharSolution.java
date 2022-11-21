package GoogleKit;

import java.util.HashMap;
import java.util.Map;

/**
 * The problem is self-explanatory
 * given a string find the maximum length string with all its characters are different
 * Input : a String
 * Output : int length
 */
public class LongestSubStringWithoutRepeatingCharSolution {
    public static int findSolution(String s){
        int slow = 0;
        int ret = 0;
        Map<Character, Integer> seen = new HashMap<>();

        for(int fast = 0;fast<s.length(); fast++){
            if(seen.getOrDefault(s.charAt(fast), -1) != -1){
                slow = fast;
            }
            seen.put(s.charAt(fast), fast);
            ret = Math.max(ret, fast-slow+1);

        }
        return ret;
    }
}
