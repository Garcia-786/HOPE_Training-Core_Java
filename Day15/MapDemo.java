package Day15;
/*
map interface:
  - key-value pairs
  - keys are unique, values can be duplicate
HashMap:
  - store duplicate values but not duplicate keys
  - fns: put, get, remove, containsKey
  - map.getorDefault(key, defaultValue) returns the value of specified key, or defaultValue 
    freq- map.put(key, map.getOrDefault(key, 0) + 1);
*/
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 4, 8, 10};
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(i,arr[i]);
        }
        System.out.println(m);//{0=9, 1=5, 2=6, 3=4, 4=8, 5=10}
        System.out.println(m.keySet());//[0, 1, 2, 3, 4, 5]
        /* 
        Map.Entry:
        - inner interface
        - logic:
        
        */
        for(Map.Entry<Integer, Integer> e: m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
