//60171634 박건희
//이 클래스는 Drawable을 구현하는 클래스입니다.
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