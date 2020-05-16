package cn.tedu.shoot05;
import java.awt.image.BufferedImage;
/** 天空: 是飞行物 */
public class Sky extends FlyingObject {
	private static BufferedImage image; //图片
	static{
		image = loadImage("background.png");
	}
	
	private int y1; //第2张图片的y坐标
	private int speed; //移动速度
	/** 构造方法 */
	public Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
	}
	
	/** 重写step() */
	public void step(){
		System.out.println("天空的y坐标和y1坐标移动了"+speed);
	}
	
}

















