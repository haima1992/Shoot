package cn.tedu.shoot05;
import java.awt.image.BufferedImage;
/** 英雄机: 是飞行物 */
public class Hero extends FlyingObject {
	private static BufferedImage[] images; //图片数组
	static{
		images = new BufferedImage[2]; //两张图片
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("hero"+i+".png");
		}
	}
	
	private int life;       //命
	private int doubleFire; //火力值
	/** 构造方法 */
	public Hero(){
		super(97,124,140,400);
		life = 3;
		doubleFire = 0;
	}
	
	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	public void moveTo(int x,int y){
		System.out.println("英雄机随着鼠标移动啦!");
	}
	
	/** 重写step() */
	public void step(){
		System.out.println("英雄机切换图片啦!");
	}
	
}














