package Interface;

public class Vehicle implements Bike1,Bike2 {
	
	@Override
	public void speed() {
	System.out.println("speed : 136kmph");//implementation part
	}
@Override
	public void cc() {
		System.out.println("cc    : 150cc");		
	}
@Override
public void colour() {
	System.out.println("colour:Blue");
}
@Override
public void model() {
	System.out.println("model :R15 V3");
	
}
//main function
public static void main(String[] args) {
	//object creation
	Vehicle yamaha=new Vehicle();
	//method calling
	yamaha.speed();
	yamaha.cc();
	yamaha.model();
	yamaha.colour();
}
}
