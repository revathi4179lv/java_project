package ifclas;

public class nestifexam {
public static void main(String[] args) {
	int sal=60;
	
	if (sal<50) {
		System.out.println("general manager");
	}
	else if(sal>=10 && sal<20) {
		System.out.println("fresher");
	} 
	else if(sal>=20 && sal<30) {
		System.out.println("exprience");
	}
	else if(sal>=31 && sal<40) {
		System.out.println("L salary");
	}
	else if (sal>=50 && sal<100){		
	System.out.println("TL");
	}
	else {
		System.out.println("not a employee");
	}
}
}
