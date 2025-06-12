package strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharactersStreams {
    public static void main(String[] args){
        String s = "vandhana";
        LinkedHashMap<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);//this will give occurrence of letters
        for(Map.Entry<String,Long> e :map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
