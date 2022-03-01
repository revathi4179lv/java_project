package loop;

public class evennum{
	public static void main(String[] args) {
	int num=1; //num=2 means print even number
		for (int i = 1; i<=5; i+=2) {
			for (int j = 1; j <=i; j++) {
				System.out.print(num+" ");
			}
			System.out.println();
			num+=2;
			
		}
	}
}

	

	