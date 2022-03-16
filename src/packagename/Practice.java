package packagename;

public class Practice {
	public static void main(String[] args)
    {
    	String arr = "Sun rises in the east";
    	
    	char[] ch = arr.toCharArray();
    	int n = ch.length;
    	String arr1 = "rises";
    	char[] cha = arr1.toCharArray();
    	int n2= cha.length;
    	//int count=0;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0; j<n2;j++)
    		{
    			if(ch[i+j]==cha[j])
    			{
    				if(j==n2)
    				{
    					System.out.println("Index of the word"+(i-j));
    				}
    				else
    				continue;
    			}
    			
    				
    			else
    				break;
    		}	
    }
    	
    }
}
