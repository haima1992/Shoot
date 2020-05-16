package cn.tedu.shoot06;
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
	
	int index = 0; //活着的图片切换的起始下标
	/** 重写getImgae()获取图片 */
	public BufferedImage getImage(){ //每10毫秒走一次
		if(isLife()){ //若活着呢，则返回两张图片的切换
			return images[index++%2];
		}
		return null;
		/*
		 *                       index=0
		 * 10M return(images[0]) index=1
		 * 20M return(images[1]) index=2
		 * 30M return(images[0]) index=3
		 * 40M return(images[1]) index=4
		 */
	}
	
}














