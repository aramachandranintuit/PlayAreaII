import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Trie {
	
	public static void main(String[] args)
	{
		String ipAddres = "74.125.100.100";
		String dns ="www.microsoft.com";
		Trie ob = new Trie();
		ob.addNode(ipAddres,dns);
		ob.addNode("74.125.100.111","www.msn.com");
		List<String> list = ob.getNode("74.125.100");
		for(String str : list)
		{
			System.out.println(str);
		}
	}
	
	TrieNode root = null;
    Trie()
    {
        root = new TrieNode();
        root.c='.';
    }

    public void addNode(String ip,String dns)
    {
        TrieNode crawl=root;
        crawl.dns.add(dns);
        for(int i=0;i<ip.length();i++)
        {
            if(crawl.map.containsKey(ip.charAt(i))) crawl = crawl.map.get(ip.charAt(i));
            else {
                TrieNode  c = new TrieNode();
                c.c=ip.charAt(i);
                crawl.map.put(ip.charAt(i),c);
                crawl= c;
            }
            crawl .dns.add(dns);
        }  
    }
    public List<String> getNode(String ip)
    {
        TrieNode crawl=root;
        List<String> list = null;
        for(int i=0;i<ip.length();i++)
        {
            if(crawl.map.containsKey(ip.charAt(i))) crawl = crawl.map.get(ip.charAt(i));
            else return null;
            if(i==ip.length()-1)
            {
                list = new ArrayList(crawl.dns);
            }
        }  
        return list;
    }

}

class TrieNode
{
    char c;
    Map<Character,TrieNode> map = new HashMap();
    HashSet<String> dns = new HashSet<>();
}

//class Trie{
//
//
//    
//}