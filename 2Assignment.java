// Print a pattern like this

// A 
// A B 
// A B C 

package learnJava;

public class AssignmentTwo {
	public static void main(String[] args) {
		
		int n=65;
		for(int i=1; i<=3; i++)
		{
			for(char j=65; j<=n; j++)
			{
				System.out.print(j +" ");
			}
			n++;
			System.out.println();
		}
	}

}
