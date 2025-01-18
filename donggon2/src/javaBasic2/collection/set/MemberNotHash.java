package javaBasic2.collection.set;

import java.util.Objects;

public class MemberNotHash {
	private String Id;

	public MemberNotHash(String id) {
		Id = id;
	}

	public String getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Member [Id=" + Id + "]";
	}

}
