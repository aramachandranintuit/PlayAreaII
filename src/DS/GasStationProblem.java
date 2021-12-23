package DS;

public class GasStationProblem {
	
	public static void main(String[] args)
	{
		int a[] = {1,2};
		int b[] = {2,1};
		GasStationProblem gas =  new GasStationProblem();
		int minimum=Integer.MAX_VALUE ;
		for(int i=0;i<a.length;i++)
		{
			int index = gas.getMinimumStartingIndex(a[i],b[i],i,a,b,false,i);
			if(index!=-1)
			{
				minimum = Math.min(minimum, index);
			}
		}
		System.out.println(minimum);
		
	}
	
	public int getMinimumStartingIndex(int supply, int demand,int index,int[] supplyArray, int[] demandArray,boolean isLastJump,int startIndex)
	{
		if(!isLastJump)
		{
			
			if(demand > supply)
			{
				return -1;
			}
			else 
			{
				demand = demand +demandArray[index];
				supply = supply +supplyArray[index];
				if(startIndex-(index+1)==0)
					isLastJump=true;
				if(startIndex==0 && index==supplyArray.length-1)
					isLastJump=true;
				if(index == supplyArray.length-1)
				{
					return getMinimumStartingIndex(supply , demand , 0,supplyArray,demandArray,isLastJump,startIndex);
				}
				return getMinimumStartingIndex(supply , demand , index+1,supplyArray,demandArray,isLastJump,startIndex);
			}
		}
		else
		{
			return index	;
		}
	}

}
