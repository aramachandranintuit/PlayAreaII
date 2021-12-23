package DS;

import java.util.HashMap;

public class Hashmap<K,V>
{	
	int capacity=15;
	static class Entry<K,V>
	{
		K key;
		V value;
		Entry<K,V> next;
		
		private Entry(K key , V value) 
		{
			this.key = key;
			this.value = value;
			this.next = null;
		}
		@Override
		public int hashCode()
		{
			return this.key.hashCode() ^ this.value.hashCode();
		}
		
		@Override
		public boolean equals(Object o)
		{
			if(o == null)
				return false;
			if(o.hashCode() == this.key.hashCode())
				return true;
			return false;		
		}
	}
	
	Entry<K,V>[] table = new Entry[capacity];
	
	
	private int getBucket(Entry<K,V> entry)
	{
		
		int hashCode = entry.key.hashCode();
		return (hashCode % capacity);
	
	}
	
	private void put(Entry<K,V> entry)
	{
		Entry<K,V> bucket = table[getBucket(entry)];
			if(bucket == null)
			{
				bucket = new Entry<K,V>(entry.key,entry.value);
			}
			else if(bucket != null)
			{
				synchronized(bucket)
				{
					while(bucket.next !=null)
					{
						if(bucket.key == entry.key)
						{
							bucket.value = entry.value;
							return ;
						}
						bucket = bucket.next;
						
					}
					
					bucket.next = new Entry<K,V>(entry.key,entry.value);
				}
			}	
	}
}
