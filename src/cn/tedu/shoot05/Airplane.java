package cn.tedu.shoot05;
import java.awt.image.BufferedImage;
/** 小敌机: 是飞行物 */
public class Airplane extends FlyingObject {
	private static BufferedImage[] images; //图片数组
	static{
		images = new BufferedImage[5]; //5张图片
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("airplane"+i+".png");
		}
	}
	
	private int speed; //移动速度
	/** 构造方法 */
	public Airplane(){
		super(49,36);
		speed = 2;
	}
	
	/** 重写step() */
	public void step(){
		System.out.println("小敌机的y坐标移动了"+speed);
	}
}













