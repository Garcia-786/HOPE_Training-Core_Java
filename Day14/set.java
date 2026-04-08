package Day14;
/*

Set:
1. A set is a collection of unique elements, (no duplicate values) and it does not maintain any specific order.

HashSet:
1. HashSet is a class in Java that implements the Set interface using a hash table.
2. It does not maintain any order of elements and allows null values(no duplicate values).

linkedHashSet:
    doesnt allow duplicates
    Hashing for fast access
    doubly linked list to maintain order

*/
import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> linkedlist=new LinkedHashSet<>();
        Set<Integer> hset=new HashSet<>();
        int[] arr={9,5,6,4,8,10};
        for(int i:arr){
            linkedlist.add(i);
            hset.add(i);
        }
        System.out.println(linkedlist);
        System.out.println(hset);
    }
}
