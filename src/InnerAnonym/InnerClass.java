package InnerAnonym;

public class InnerClass {

	class Test1 {
	}

	class Test2 {
	}

	public static void main(String[] args) {

		new Object() {
		};
		
		
		class Develope {
			public void doTest() {
				System.out.println("Develope");
			}
		}
		
		Develope t = new Develope();
		t.doTest();

		
	}

}
