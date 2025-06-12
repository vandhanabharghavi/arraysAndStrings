package strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] arr = {"and","boy","ana","naa","tea","eat"};
        List<List<String>> list = method(arr);
        System.out.println(list);
    }
    public static List<List<String>> method(String[] arr){
        Map<String,List<String>> map = new HashMap<>();
        for(String str : arr){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            map.computeIfAbsent(s,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
