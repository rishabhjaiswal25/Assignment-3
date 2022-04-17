public class CountDuplicatesUnique {
	
	public static void main(String[] args) {
		
		int i = 0, j, dCount = 0;
		int[] arr = {2,5,7,2,4};
		
		while(i < arr.length) 
		{
			j = i + 1;
			while(j < arr.length)
			{		
				if(arr[i] == arr[j]) {
					dCount++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Duplicate Elements  = " + dCount);
		int uCount = 0;
		for(i = 0; i < arr.length; i++)
		{
        			for(j = i + 1; j < arr.length; j++)
			{	
				if(arr[i] != arr[j])
                				uCount ++;
					break;
			}
		}
		System.out.println("\nThe Total Number of Unique Elements = " + uCount);
	}
}
