package keywords;
//this keyword using constructor
public class A {
	String name;
	int id;
	float sal;
		public A() {
			System.out.println("Default const...");
		}

		public A(int id) {
			this.id=id;
			System.out.println(id);
		}

		public A(String name) {
			this.name=name;
				System.out.println(name);
		}

		public A(float sal) {
			this.sal=sal;
		System.out.println(sal);
		}
		public static void main(String[] args) {
			A a=new A();
			A b=new A(12);
			A c=new A("JAVA");
			A d=new A(3456.5678f);
		
		}
		}

