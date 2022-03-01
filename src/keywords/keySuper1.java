package keywords;

public class keySuper1 extends keySuper {

		public void set() {
			System.out.println("sub class");
			System.out.println(super.id);
		}
		public static void main(String[] args) {
			keySuper1 k=new keySuper1();
			k.show();
			k.set();
		}
		
}
