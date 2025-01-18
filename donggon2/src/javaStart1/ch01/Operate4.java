package javaStart1.ch01;

public class Operate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dong = new String("hello");
		String gon = new String("hello");
		System.out.println("dong == gon :"+(dong == gon));
		System.out.println("dong.equals(gon) : "+dong.equals(gon));
		System.out.println("dong.equals(\"hh\") : "+dong.equals("hh"));
		
		
		// 리럴 사용시 문자열 풀 사용 (메모리효율 UP)
		String donggon = "blog";
		String blog = "blog";
		System.out.println("donggon == blog : "+(donggon == blog));
		System.out.println("donggon.equals(blog) : "+donggon.equals(blog));
		System.out.println("blog.equals(\"blog2\") :"+blog.equals("blog2"));
	
		

	}

}
