package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Voting {
    public static void main(String[] args) {
        String[] votes = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie",
                "john", "johnny", "jamie", "johnny", "john"};
        Map<String,Integer> map = new HashMap<>();
        for(String i : votes){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i : map.values())
            max = Math.max(max,i);
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            if(e.getValue()==max)
                list.add(e.getKey());
        }
        System.out.println(list);
    }
}
