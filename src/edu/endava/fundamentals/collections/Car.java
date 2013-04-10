package edu.endava.fundamentals.collections;

public class Car implements Comparable{

	private String name;
	private double volume;

	public Car() {
		name = null;
		volume = .0;
	}

	public Car(String cname, double cvolume) {
		name = cname;
		volume = cvolume;
	}

	public void show() {
		System.out.println(name + " " + volume);
	}

	
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Car)) {
			return false;
		}

		Car obj1 = (Car) obj;

		return name.equals(obj1.name) && (volume == volume);
	}

	@Override
	public int hashCode() {
		int hash = 37;
		hash = hash * 17 + name.hashCode();
		hash = hash * 17 + (int) volume;

		return hash;
	}

	
	@Override
	public int compareTo(Object obj) {
		   Car tmp = (Car)obj;
		    if(this.volume < tmp.volume)
		    {		     
		      return -1;
		    }   
		    else if(this.volume > tmp.volume)
		    {		     
		      return 1;
		    }
		      return 0;  
		  }
	
}
