package javaStart2.extend1.gudiEx;
//다음 설명에 따라 Shape 클래스를 상속 받은 Circle 클래스와 Rect 클래스를 구현하시오.
//Circle 클래스는 double형 반지름(r)을 멤버로 가진다.
//Rect 클래스는 double형 가로(w), double형 세로(h)를 멤버로 가진다.
//Circle 클래스와 Rect 클래스는 면적을 반환하는 area() 메소드와 둘레를 반환하는 
	//length() 메소드를 가지고 있다.
//Shape 클래스 타입의 배열 arr에 저장된 2개 객체의 면적의 합계와 둘레의 합계를 각각 출력하시오.
//[지시사항]
//원주율 : Math.PI를 이용하시오.
//모든 결과는 int형으로 변환하여 출력하시오.
//
//[결과]
//514
//122
//	

public class Shape {
	double area() {
		return 0;
	}
	double length() {
		  return 0;
	  }
	
	static class Circle extends Shape {
		  private double r;
		  
		  public Circle(double r) {
			  this.r = r;
		  }
		  @Override
		  double area(){ 
			  return Math.PI*(r*r);
		  }
		  @Override
		  double length() {
			  return 2*Math.PI*r;
		  }
		  
		}

		static class Rect/* (사각형) */extends Shape {
		  public Rect(int w, int h) {
				this.w = w;
				this.h =h;
			}

		private double w, h;
		@Override
		  double area(){ 
			  return w*h;
		  }
		  @Override
		  double length() {
			  return (2*(w+h));
		  }
		}

		public static void main(String[] args) {
			Shape[] arr = new Shape[2];
			  arr[0] = new Circle(10);
			  arr[1] = new Rect(10,20);
			  int area = 0;
			  int length = 0;
			  for (Shape shape : arr) {
				 area += (int)shape.area();
				 length += (int)shape.length();	
			}
			System.out.println(area);
			System.out.println(length);

		}
		@Override
		public String toString() {
			return "Shape []";
		} 
		  
		  
		

}
