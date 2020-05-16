package cn.tedu.shoot08;
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
		doubleFire = 10; //默认为0(单倍火力)
	}
	
	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	public void moveTo(int x,int y){
		this.x = x-this.width/2;  //英雄机的x=鼠标的x-1/2英雄机的宽
		this.y = y-this.height/2; //英雄机的y=鼠标的y-1/2英雄机的高
	}
	
	/** 重写step() */
	public void step(){
		
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
	
	/** 英雄机发射子弹(生成子弹对象) */
	public Bullet[] shoot(){
		int xStep = this.width/4; //xStep:1/4英雄机的宽
		int yStep = 20;           //yStep:固定的20
		if(doubleFire>0){ //双
			Bullet[] bs = new Bullet[2]; //2发子弹
			bs[0] = new Bullet(this.x+1*xStep,this.y-yStep); //x:英雄机的x+1/4英雄机的宽 y:英雄机的y-固定的20
			bs[1] = new Bullet(this.x+3*xStep,this.y-yStep); //x:英雄机的x+3/4英雄机的宽 y:英雄机的y-固定的20
			doubleFire-=2; //发射一次双倍火力，则火力值减2
			return bs;
		}else{ //单
			Bullet[] bs = new Bullet[1]; //1发子弹
			bs[0] = new Bullet(this.x+2*xStep,this.y-yStep); //x:英雄机的x+2/4英雄机的宽 y:英雄机的y-固定的20
			return bs;
		}
	}
	
	/** 重写outOfBounds()检测越界 */
	public boolean outOfBounds(){
		return false; //永不越界
	}
	
}














