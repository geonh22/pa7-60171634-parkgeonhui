//60171634 �ڰ���
//�� Ŭ������ shape�� ���� �޼ҵ���� ��ӹ޾� �簢���� ���̿� �ѷ��� ���ϴ� Ŭ�����Դϴ�.
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