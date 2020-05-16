package cn.tedu.shoot05;
import java.awt.image.BufferedImage;
/** 子弹: 是飞行物 */
public class Bullet extends FlyingObject {
	private static BufferedImage image; //图片
	static{
		image = loadImage("bullet.png");
	}
	
	private int speed; //移动速度
	/** 构造方法 */
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	
	/** 重写step() */
	public void step(){
		System.out.println("子弹的y坐标移动了"+speed);
	}
	
}










