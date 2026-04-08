package Day15;

import java.util.*;

public class LC_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            if(s.contains(i))
                return true;
            s.add(i);
        }
        return false;
    }
}
