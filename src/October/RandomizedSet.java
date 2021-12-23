package October;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

class RandomizedSet {
	
	public static void main(String[] args)
	{
		RandomizedSet r = new RandomizedSet();
		r.insert(3);
		r.remove(-2);
		r.insert(2);
		System.out.println(r.getRandom());
		r.remove(1);
		r.insert(2);
		System.out.println(r.getRandom());
	}
    /** Initialize your data structure here. */
    HashSet<Integer> map = null;
    List<Integer> list = null;
    public RandomizedSet() {
        map = new HashSet<Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean flag = map.contains(val);
        if(!flag)
        {      
        		map.add(val);
            list.add(val);
        }
        return !flag;      
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean flag = map.contains(val);
        if(flag)
            {
        		map.remove(val);
        		list.remove((Object) val);
        		list.addAll(map);
            }
        return flag;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
        
    }
}