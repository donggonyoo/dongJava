package javaBasic2.collection.map.ex;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MemberRepository {
	
	Map<String ,Member> map = new HashMap<>();
	
	public void save(Member member) {
		map.put(member.getId(), member);
	}
	

	public Member findById(String string) {
		return map.get(string);
		}


	public Member findByName(String string) {
		for(Member member : map.values()) {
			if(member.getName().equals(string)) {
				return member;
			}
		}
		return null;
	}


	public void remove(String string) {
		map.remove(string);
		
	}

}
