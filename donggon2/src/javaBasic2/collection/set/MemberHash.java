package javaBasic2.collection.set;

import java.util.Objects;

public class MemberHash {
	private String Id;

	public MemberHash(String id) {
		Id = id;
	}

	public String getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Member [Id=" + Id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberHash other = (MemberHash) obj;
		return Objects.equals(Id, other.Id);
	}

	
	
	
	
	
	
	

}
