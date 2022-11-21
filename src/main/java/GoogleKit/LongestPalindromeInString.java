package GoogleKit;

import java.util.Arrays;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume
 * that the maximum length of s is 1000
 * Input: A string
 * Output: the longest palindrome in that string
 */
public class LongestPalindromeInString {
    public static String findSolution(String str){
        int n = str.length();
        int start = 0;
        int max_len = 1;
        if(str.length() == 1){
            return str;
        }
        boolean[][] dp = new boolean[n][n];
        for(int i = 0;i<n;i++){
            dp[i][i] = true;
        }
        for(int i= n-3;i>= 0;i--){
            for(int j = i+2;j<n;j++){
                dp[i][j] = dp[i+1][j-1] && str.charAt(i)== str.charAt(j);
            }
        }
        for (int i= 0;i<n;i++){
            for(int j=i;j<n;j++){
                if(dp[i][j] && j-i +1 > max_len){
                    max_len = j-i+1;
                    start = i;
                }
            }
        }
        return str.substring(start, max_len);
    }
}
