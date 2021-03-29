// Print a pattern like this

// $ $ $ $ 
// $     $ 
// $     $ 
// $ $ $ $ 

package learnJava;

public class AssignmentThree {
	public static void main(String[] args) {
		
        
		int n=4;
		
		for(int i=1; i<=n; i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1; j<=n;j++)
				{
					System.out.print("$ ");
				}
			}
			else 
			{
				for(int k=1; k<=n; k++)
				{
					if(k==1 || k==n)
					{
						System.out.print("$ ");
					}
					else {
						System.out.print("  ");
					}
					
				}
			}
			System.out.println();
		}
		
	}

}
