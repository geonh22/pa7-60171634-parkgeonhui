//60171634 박건희
//이 클래스는 shape로 부터 메소드들을 상속받아 사각형의 넓이와 둘레를 구하는 클래스입니다.
package practice7;

public class Rectangle extends Shape {

	public Rectangle(double x1, double y1, double x2, double y2) {}
	
	public double getArea() {
		Area = Math.abs((x2-x1) * (y2-y1));
		return Area;
	}
	
	public double getLength() {
		Length = Math.abs((x2-x1)*2 + (y2-y1)*2);
		return Length;
	}
}