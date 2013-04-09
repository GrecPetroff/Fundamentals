package Exceptions;

public class Car {

	private String name;
	private double volume;

	public Car() {
		name = "Unknown";
		volume = 1.3;
	}

	public Car(String cname, double cvolume) throws EngineVolumeException {
		name = cname;
		if (cvolume <= 0) {
			throw new EngineVolumeException("Something wrong");
		} else {
			volume = cvolume;
		}
	}

	public void show() {

		if (this == null) {
			System.out.println("Null value");
		} else {
			System.out.println(name + " " + volume);
		}
	}

}
