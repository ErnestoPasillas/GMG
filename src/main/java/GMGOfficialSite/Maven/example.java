package GMGOfficialSite.Maven;

public class example {
	
	
	
	public static void imprimePares(int ar[], int n, int sum)
	{
		for (int i = 0; i< n; i++) 
		{
			for(int j= i  + 1 ; j<n ; j++)
			{
				
				if (ar[i] + ar[j] == sum) {
					System.out.println("los pares de nueros que me dan el que yo ingrse son:" +  "(" + ar[i] + "," + ar[j] + ")");
				}
			}
		}
			
	}
	
	
	
	
	public static void main(String[] arg)
	{
		int ar[] = {0,1,2,3,4,-3,6};
		
		int n = ar.length;
		
		int sum = 3;
		
		
	//	imprimePares(ar, n , sum);
		
		
		
		for (int i = 0; i< n; i++) 
		{
			for(int j= i  + 1 ; j<n ; j++)
			{
				
				if (ar[i] + ar[j] == sum) {
					System.out.println("los pares de nueros que me dan el que yo ingrse son:" +  "(" + ar[i] + "," + ar[j] + ")");
				}
			}
		}
		
	}
	

}
