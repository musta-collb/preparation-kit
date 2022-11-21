package GoogleKit;

import java.util.ArrayList;
import java.util.List;

public class ZigZagString {
    public static String findSolution(String str, int numRows){
        StringBuilder[] result = new StringBuilder[numRows];
        if(numRows == 1){
            return str;
        }
        for(int i = 0;i<numRows;i++){
            result[i] = new StringBuilder();
        }
        boolean flip = false;
        int k = 0;
        for(int i = 0;i<str.length();i++){
            result[k].append(str.charAt(i));
            if(k < numRows && ! flip){
                k++;
                if(k == numRows-1){
                    flip = true;
                }
            }else{
                k--;
                if(k == 0){
                    flip = false;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(StringBuilder s: result){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
