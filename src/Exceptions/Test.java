package Exceptions;

public class Test {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		
		try {
			car1 = new Car("bmw", .0);
		} catch (EngineVolumeException e) {
			System.out.println("Wrong engine volume. \n" +
							   "Setting default volume.");
			
		}

		car1.show();
		
		Car car3 = null;
		
		assert (car3 == null) : "Object is null";
		
	}
}
