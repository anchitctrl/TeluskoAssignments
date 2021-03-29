// Print pattern like this

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 


package learnJava;

public class AssignmentOne {
	public static void main(String[] args) {
		

		int i,j;
		for(j=1; j<=6;j++) 
		{
			for(i=1;i<=j; i++) 
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
