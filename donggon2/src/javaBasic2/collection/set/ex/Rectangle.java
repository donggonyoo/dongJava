package javaBasic2.collection.set.ex;

import java.util.Objects;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width ,int height) {
		this.width = width;
		this.height = height;
	}
	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	
	

}
