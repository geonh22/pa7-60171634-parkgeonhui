//60171634 �ڰ���
//�� Ŭ������ shape�� ���� �޼ҵ���� ��ӹ޾� ���� ���̿� �ѷ��� ���ϴ� Ŭ�����Դϴ�.
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
