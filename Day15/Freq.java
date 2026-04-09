package Day15;

import java.util.*;
public class Freq {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,3,2,1,4,4};
        Map<Integer, Integer> m = new HashMap<>();
        //using containsKey fn
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }
            else{
                m.put(i, 1);
            }
        }
        //using getOrDefault fn 
  /*    for(int i=0;i<arr.length;i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }*/
       for(Map.Entry<Integer, Integer> e: m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
