
package Day15;
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{0,1},{15,18}};
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                list.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        list.add(new int[]{start, end});
        for(int[] i : list) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}