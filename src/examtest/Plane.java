package examtest;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes = 0;
		
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
		
		
	}
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
		} else {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}	
	}
	
	public Plane() {
		this("록히든 마틴","F-22",-10);
	}
	
	@Override
	public String toString() {
		return "Plane [manufacture=" + manufacture + ", model=" + model + ", maxNumberOfPassengers="
				+ maxNumberOfPassengers + "]";
	}
	 public static int getNumberOfPlanes() {
 		return numberOfPlanes;
 	}
}

	