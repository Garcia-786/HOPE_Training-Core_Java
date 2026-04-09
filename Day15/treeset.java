package Day15;
/*

TreeSet:
      - uses self-balancing binary search tree (Red-Black Tree) to store elements in sorted order.
      - inorder (Left, Root, Right) traversal of the tree gives the elements in sorted order.

strictly closest- use lower and higher fns of treeset
closest- use floor and ceiling fns of treeset
*/
import java.util.*;
public class treeset {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 40};
        int target = 25;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : arr) {
            ts.add(i);
        }
        Integer flr = ts.lower(target);
        Integer cl = ts.higher(target);
        int closest;
        if (flr == null) 
            closest = cl;
        else if (cl == null)
            closest = flr;
        else
            closest = (target - flr <cl - target) ? flr : cl;       
        System.out.println(closest);
    }
}