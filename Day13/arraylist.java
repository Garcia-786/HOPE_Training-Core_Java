package Day13;

import java.util.*;

public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,9,13));
        for(int i=0;i<list.size();i++){ // print odd nums
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list); 
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        ArrayList<Integer> unique_list=new ArrayList<>();
        for(int i=0;i<list2.size();i++){ // remove duplicates
            if(!unique_list.contains(list2.get(i)))
                unique_list.add(list2.get(i));
        }
        System.out.println(unique_list);
    }
}