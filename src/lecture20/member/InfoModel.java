package lecture20.member;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InfoModel {
	private IntegerProperty infoNo;
	private StringProperty pcNo;
	private StringProperty nm;
	private StringProperty email;
	private StringProperty hobby;
	
	public InfoModel(String pcNo, String nm, String email, String hobby) {
		this.pcNo = new SimpleStringProperty(pcNo);
		this.nm = new SimpleStringProperty(nm);
		this.email = new SimpleStringProperty(email);
		this.hobby = new SimpleStringProperty(hobby);
	}
	
	public InfoModel(int infoNo, String pcNo, String nm, String email, String hobby) {
		this.infoNo = new SimpleIntegerProperty(infoNo);
		this.pcNo = new SimpleStringProperty(pcNo);
		this.nm = new SimpleStringProperty(nm);
		this.email = new SimpleStringProperty(email);
		this.hobby = new SimpleStringProperty(hobby);
	}

	public final IntegerProperty infoNoProperty() {
		return this.infoNo;
	}

	public final int getInfoNo() {
		return this.infoNoProperty().get();
	}

	public final void setInfoNo(final int infoNo) {
		this.infoNoProperty().set(infoNo);
	}

	public final StringProperty pcNoProperty() {
		return this.pcNo;
	}

	public final String getPcNo() {
		return this.pcNoProperty().get();
	}

	public final void setPcNo(final String pcNo) {
		this.pcNoProperty().set(pcNo);
	}

	public final StringProperty nmProperty() {
		return this.nm;
	}

	public final String getNm() {
		return this.nmProperty().get();
	}

	public final void setNm(final String nm) {
		this.nmProperty().set(nm);
	}

	public final StringProperty emailProperty() {
		return this.email;
	}

	public final String getEmail() {
		return this.emailProperty().get();
	}

	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}

	public final StringProperty hobbyProperty() {
		return this.hobby;
	}

	public final String getHobby() {
		return this.hobbyProperty().get();
	}

	public final void setHobby(final String hobby) {
		this.hobbyProperty().set(hobby);
	}

	@Override
	public String toString() {
		return "InfoModel [infoNo=" + getInfoNo() + ", pcNo=" + getPcNo() + ", nm=" + getNm() 
			 + ", email=" + getEmail() + ", hobby=" + getHobby() + "]";
	}
}
