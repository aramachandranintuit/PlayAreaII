package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Events {
	
	public static void main(String[] args)
	{
		int[][] events = {{1,4},{4,4},{2,2},{3,4},{1,1}};
		System.out.println(maxEvents(events));
	}
	public static int maxEvents(int[][] events) {
        Arrays.sort(events, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int[] e : events) {
            minDay = Math.min(minDay, e[0]);
            maxDay = Math.max(maxDay, e[1]);
        }
        List<Integer> temp = new ArrayList<>();
        for (int i = minDay; i <= maxDay; i++) {
            temp.add(i);
        }
        TreeSet<Integer> set = new TreeSet<>(temp);
//        System.out.println(set);
        int ans = 0;
        for (int[] e : events) {
        		
            Integer firstAvailableDay = set.ceiling(e[0]);
            System.out.println(Arrays.toString(e) + "Available - day" + firstAvailableDay);
            if (firstAvailableDay != null && firstAvailableDay <= e[1]) {
                ans++;
                set.remove(firstAvailableDay);
            }
        }
        return ans;
    }
	

}
