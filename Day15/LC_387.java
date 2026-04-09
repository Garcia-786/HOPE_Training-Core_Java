package Day15;
import java.util.*;
class LC_387 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char i:s.toCharArray()){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }
            else{
                m.put(i, 1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}