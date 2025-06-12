package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeats {
    public static void main(String[] args) {
        String s = "abdcabdabdcedabcd";
        Set<Character> set = new HashSet<>();
        int right =0,left=0,max=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                max = Math.max(max,right-left+1);
                right++;
            }else{
                set.remove(ch);
                left++;
            }
        }
        System.out.println(max);

    }
    }
