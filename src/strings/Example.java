package strings;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","aaa","ccc","BBB","ddd");
        Map<String,Integer> map = new HashMap<>();
        for(String i:list){
            map.put(i.toLowerCase(),map.getOrDefault(i,0)+1);
        }
        Map<String,Long> res = list.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x->x,
                Collectors.counting()));
        System.out.println(map);
        System.out.println(res);
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("apple", "banana", "cherry"),            Arrays.asList("banana", "date", "fig"),
                Arrays.asList("grape", "apple", "kiwi"));
        List<String> flat = nestedList.stream().flatMap(List::stream).distinct().collect(Collectors.toList());

        //input = 5
        //
        //output = 5,16,8,4,2,1
        int x = 5;
        List<Integer> list1 = new ArrayList<>();
        while(x!=1) {
            if (x % 2 == 0) {
                x=x / 2;
                list1.add(x);
            }
            else {
                x=(x * 3) + 1;
                list1.add(x);
            }
            System.out.println(list1);
        }
    }
    }
    //employee id name salary manager_id dept_id
    //department dept_id department_name

//empid=5
//select emp.name,emp.salary,m.name from employee emp
// join employee m on m.emp_id=e.emp_id where emp.id=5;

//select e.dept_id,sum(salary) from employee ee
//join department d on d.emp_id=e.emp_id
//group by d.dept_name;



