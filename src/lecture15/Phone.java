package lecture15;

import java.util.Objects;

public class Phone {
	private String model;
	private int capacity;
	private String manufacturer;
	
	public Phone(String model, int capacity, String manufacturer) {
		super();
		this.model = model;
		this.capacity = capacity;
		this.manufacturer = manufacturer;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", capacity=" + capacity + ", manufacturer=" + manufacturer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(manufacturer, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Phone)) {
			return false;
		}
		Phone other = (Phone) obj;
		return Objects.equals(manufacturer, other.manufacturer) && Objects.equals(model, other.model);
	}
	
}
