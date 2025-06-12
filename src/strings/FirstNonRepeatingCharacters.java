package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {
    public static void main(String args[]){
        String s = "vandhana";
        //better to use hashmap
        //or use streams
        //first try to solve using the hashmap
        //but hashmap there is no order
        //but linked hashmap preserves the order
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        System.out.println(map);
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
