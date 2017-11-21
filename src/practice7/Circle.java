//60171634 박건희
//이 클래스는 shape로 부터 메소드들을 상속받아 원의 넓이와 둘레를 구하는 클래스입니다.
package practice7;

public class Circle extends Shape {
	double Area;
	double Length;
	double x1;
	double y1;
	double radius;
	
	public Circle (double x1, double y1, double radius) {}
	
	public double getArea() {
		Area = radius * radius * 3.1415;
		return Area;
	}
	
	public double getLength() {
		Length = radius * 2 * 3.1415;
		return Length;
	}
}
