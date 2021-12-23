package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


 class TreeNode {
	    int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val;left =null ;right=null; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
 class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
 
 
 
public class test {
	Hashtable<Object,Object> a1 = null;
	

	
	 public static boolean isPowerOfFour(int num) {
//		 if(!(num > Integer.MIN_VALUE && num <Integer.MAX_VALUE))
//			 return false;
		 
		 
		 if(num<0 && num >Integer.MAX_VALUE)
			 return false;
		 else
		 {
			 while(num>1)
	        {
	        		if(num%4==0)
	        			num=num/4;
	        		else
	        			return false;
	            
	        }
		 }
	        return true;
	        
	    }
	public  static void main(String[] args)
	{
		int[] a= {1,2,3,4};
		permutations(a,a.length);
		
	}
	
	
	public static void permutations(int[] a,int n)
	{
		if(n==1)
		{
		print(a);
		}
		for(int i=0;i<n;i++)
		{	
			permutations(a,n-1);
			if(n%2==1)
			{
				int temp = a[0];
				a[0] = a[n-1];
				a[n-1]=temp;
			}
			else
			{
				int temp = a[i];
				a[i] = a[n-1];
				a[n-1]=temp;
				
			}
		}
		
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
	}
	
	public static int countOnes(int n)
	{
		int count=0;
		while(n!=0)
		{
			n= n & (n-1);
			count++;
		}
		return count;
	}
	
	public boolean isSymmetric(TreeNode root) 
    {
        return isSymmetric(root,mirrorTree(deepCopy(root)));
        
    }
	
	
	private TreeNode deepCopy(TreeNode root)
    {
        if(root!=null)
        {
            TreeNode mirroredLeft =deepCopy(root.left);
            TreeNode mirroredRight = deepCopy(root.right);
            TreeNode mirroredRoot = new TreeNode(root.val,mirroredLeft,mirroredRight);
            return mirroredRoot;
            
        }
        else
            return root;
    }
    
    private boolean isSymmetric(TreeNode root,TreeNode mirroredRoot)
    {
    		if(root!=null && mirroredRoot!=null)
    		{
    			if(root.val == mirroredRoot.val && isSymmetric(root.left,mirroredRoot.left) && isSymmetric(root.right,mirroredRoot.right))
    				return true;
    			else return false;    			
    		}
    		if(root==null && mirroredRoot==null)
    			return true;
    		return false;
    		
    }
    
    private TreeNode mirrorTree(TreeNode root)
    {
        if(root!=null)
        {
            TreeNode left = mirrorTree(root.left);
            TreeNode right = mirrorTree(root.right);
            root.left = right;
            root.right =left;
        }
        return root;
        
    }
	
	public int diameterOfBinaryTree(TreeNode root) {
        
        return getDia(root,0);
    }
	
	
	private int getDia(TreeNode root,int Dia)
    {
        if(root!=null)
        {
            TreeNode left = root.left;
            TreeNode right = root.right;
            int maxDia =0;
            if(left!=null && right!=null)
            {
                maxDia = Math.max(Dia,2+getHeight(left) + getHeight(right));
                return Math.max(maxDia , Math.max(getDia(left,maxDia),getDia(right,maxDia)));
            }
            else if(left==null && right!=null)
            {
                maxDia = Math.max(Dia,1+getHeight(right));
                return Math.max(maxDia , getDia(right,maxDia));
            }
            else if(left!=null && right==null)
            {
                maxDia = Math.max(Dia,1+getHeight(right));
                return Math.max(maxDia , getDia(left,maxDia));
            }
            else 
            {
                maxDia =0;
                return maxDia;
            }
         }
        else
            return 0;
        
    }
    
    private int getHeight(TreeNode root)
    {
        if(root!=null && (root.left!=null || root.right!=null))
            return 1 + Math.max(getHeight(root.left),getHeight(root.right));
        else
            return 0;
    }
	
	public  int maxProfit(int[] prices) 
    { 
       int index = prices.length-1;
       int maxProfit=0;
       int maxPrice =prices[index];
       while(index>=0)
       {
    	   	maxPrice = Math.max(maxPrice, prices[index]);
    	   	maxProfit = Math.max(maxProfit,maxPrice - prices[index]);
    	   	index--;
    	   	
       }
       return maxProfit;
    }
    
    
    private int findLowestIndex(int [] prices,int endIndex)
    {
        int lowest = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0;i<endIndex;i++)
        {
            if(prices[i]<lowest)
                {
                lowest=prices[i];
                index=i;
            }
        }
        return index;
    }
    private int findLowestIndex(int [] prices)
    {
        int lowest = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<lowest)
                {
                lowest=prices[i];
                index=i;
            }
        }
        return index;
    }
    
    private int findHighest(int [] prices,int startIndex)
    {
        int max = Integer.MIN_VALUE;
        int index=0;
        for(int i=startIndex;i<prices.length;i++)
        {
            if(prices[i]>max)
            {
                max=prices[i];
                index=i;
            }
        }
        return index;
    }
    
 
	
	
	private static void moveZeros(int[] nums)
	{
		int i=0;
		int c =1;
		int temp=0;
		while(c<=nums.length-1)
		{
			if(nums[i]==0 && nums[c]!=0)
			{
				temp =nums[i];
				nums[i] = nums[c];
				nums[c]=temp;
				c++;
				i++;
			}
			else if(nums[i]==0 && nums[c]==0)
			{
				c++;
			}
			else if(nums[i]!=0 && nums[c]==0)
			{
				c++;
				i++;
			}
		}
	}
	
	public static int majorityElement(int[] nums) {
        int majority = nums.length/2;
        int counter=0;
        int majorityElement = 0;
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i =0;i<=nums.length-1;)
        {
        		if(i==nums.length-1 && (nums[i-1]- nums[i] ==0))
        		{
        			counter= counter+1;
        			if(counter>majority)
        				majorityElement=nums[i];
        		}
        		else if(nums[i]-nums[i+1]==0)
            {       
                 counter=counter+1;
                if(counter>majority)
                {
                    majority = counter;
                    majorityElement = nums[i];
                }   
            }
            else
            {             
                counter=0;
            }     
            i=i+1;
        }
        
        return majorityElement;
        
    }
	
	private ListNode addToTail(int val , ListNode tail)
	{
		ListNode newNode  = new ListNode(val);
		tail.next = newNode;
		tail = newNode;
		return tail;
		
	}
	
	
	private ListNode recursion(ListNode node)
	{
		if(node == null)
			return node;
		if(node.next==null)
			return node;
		if(node!=null)
			{
				ListNode temp = node.next;
				ListNode newHead = recursion(temp);
				temp.next = node;
				node.next = null;
				return newHead;
			}
		return node;		
	}
	
	private ListNode reverseList(ListNode node)
	{
		ListNode previous = null;
		ListNode current = node;
		ListNode nextNode = null;
		while(current!=null)
		{
			nextNode =current.next;
			current.next = previous;
			previous =current;
			current = nextNode;	
			
		}
		
		return previous;
	}
	private static int sumOfDigits(int sum,int number)
	{
		while(number >0)
		{
			sum = sum + number%10;
			number=number/10;
		}
		
		return sum;
	}
	
	 public static int singleNumber(int[] nums) {
	       Arrays.sort(nums);
	        for(int i=0;i<=nums.length-1;i=i+2)
	        {	      
	        	if(i<nums.length-1)
		        	{ if(nums[i] - nums[i+1]!=0)
		            {
		                if(i!=0)
		                {
		                    if (nums[i] == nums[i-1])
		                        return nums[i+1];	
		                    else
		                    		return nums[i];
		                }
		                else 
		                    return nums[i];
		            }
	        	}
	        	if(i==nums.length-1)
	        	{
	        		return nums[i];
	        	}
	        }
	        return -1;
	        
	    }

}
