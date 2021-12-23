package October.Spotnana;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class EnergyExchange {
	
	public static void main(String[] args)
	{
		double mid=0.0;
		double lo=0;
		double hi=2000;
		int[] a = {1 ,11};
		int k=90;
		double m =(double)(1.0-k/100.0);
		for(int j=0;j<1000;j++)
        {
			mid=(lo+hi)/2;
            double s=0.0;
            for(int i=0;i<a.length;i++)
            {

                if(a[i]>mid)
                    s=s+(a[i]-mid)*m;
                else
                    s=s+(a[i]-mid);
            }
            if(s>=0)
                lo=mid;
            else
                hi=mid;
            
        }
       System.out.println(mid);
	}

}



