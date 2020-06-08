package lecture11;

import java.util.Objects;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name); //return 31 * id.hashCode(); 계산식. 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);

	}

	@Override
	public String toString() {
		return id + ": " + name;
	} //무조건 만들라!!!!!!!!!!!!!!
//ToStringBuilder 로 구현하는 추세. 
/*	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); 클론은 재정의해서 써야한다. */
	}
	

