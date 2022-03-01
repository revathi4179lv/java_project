package loop;

public class forstar {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
				// or System.out.print("*"); * replaced j means j value now converted to *
				}
			System.out.println();
		}
	}

}
