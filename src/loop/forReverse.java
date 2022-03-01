package loop;

public class forReverse {
public static void main(String[] args) {
	//reverse triangle
	int num;
	for (int i = 0; i <=5; i++) {
		num=1;
		for (int j =5; j>=i; j--) {
			System.out.print(num+" ");
			num++;
			//System.out.println("*"); j replaced by *
		}
		System.out.println();
	}
}
}
