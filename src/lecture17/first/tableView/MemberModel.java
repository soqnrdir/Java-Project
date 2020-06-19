package lecture17.first.tableView;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MemberModel {
	private StringProperty name;
	private StringProperty mobileNumber;
	public MemberModel(String name, String mobileNumber) {
		this.name = new SimpleStringProperty(name);
		this.mobileNumber = new SimpleStringProperty(mobileNumber);
	}
	public String getName() {
		return name.get(); //문자열로 반환
	}
	public void setName(String name) {
		this.name.set(name);;
	}
	public StringProperty getNameProperty() {
		return name;
	}
	public String getMobileNumber() {
		return mobileNumber.get();
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber.set(mobileNumber);
	}
	public StringProperty mobileNumberProperty() {
		return mobileNumber;
	}
	@Override
	public String toString() {
		return "MemberModel [name=" + name.get() + ", mobileNumber=" + mobileNumber.get() + "]";
	}
	
	
}
