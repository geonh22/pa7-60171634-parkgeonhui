//60171634 �ڰ���
//�� Ŭ������ Drawable�� �����ϴ� Ŭ�����Դϴ�.
package practice7;

abstract public class Text implements Drawable {
	String message;
	 Text(String message){
		 this.message = message;
	 }
		 public void draw() {
			 System.out.println(message);
		 }
	 }