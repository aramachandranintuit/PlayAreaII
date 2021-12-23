package leetcode;

import java.net.*;
import java.util.HashMap;
import java.io.*;

public class TCPClient {
	 
   public static void main(String [] args) throws IOException 
   {
//	   ec2-54-157-130-71.compute-1.amazonaws.com
	   
//	   514
	   getDatOutputStream("ec2-54-157-130-71.compute-1.amazonaws.com",514,Integer.parseInt(args[0]),10000);
      
   }
   
   private static void getDatOutputStream(String server,int port,int numberOfConnections, int numberOfmessages) throws IOException
   {
	    HashMap<Integer,Socket> socketMap = new HashMap<Integer,Socket>();
	    Socket client = null;
	    for(int i=0;i<numberOfConnections;i++)
	   	{
		   client = new Socket(server, port);
		   socketMap.put(i, client);
		   System.out.println("Just connected to + " + i +"  : " + client.getRemoteSocketAddress());
	   	}
         for(Socket clientItr:socketMap.values())
        {
        		OutputStream outToServer = clientItr.getOutputStream();
        		DataOutputStream out = new DataOutputStream(outToServer);  
        		for(int i=0;i<numberOfmessages;i++)
        		{	
        			out.writeChars("Hello from " + client.getLocalSocketAddress());
        			InputStream inFromServer = client.getInputStream();
        			DataInputStream in = new DataInputStream(inFromServer);
        		}
        }
   }
}
