package cn.tedu.shoot07;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics;
/** 飞行物 */
public abstract class FlyingObject {
	public static final int LIFE = 0;   //活着的
	public static final int DEAD = 1;   //死了的(未删)
	public static final int REMOVE = 2; //删除的
	protected int state = LIFE; //当前状态(默认为活着的)
	
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	/** 专门给英雄机、天空、子弹提供的 */
	public FlyingObject(int width,int height,int x,int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	/** 专门给小敌机、大敌机、小蜜蜂提供的 */
	public FlyingObject(int width,int height){
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH-this.width); //x:0到(窗口宽-小敌机宽)之间的随机数
		y = -this.height; //y:负的小敌机的高
	}
	
	/** 飞行物移动 */
	public abstract void step();

	/** 读图片 */
	public static BufferedImage loadImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //同包中读图片
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/** 获取图片 */
	public abstract BufferedImage getImage();
	
	/** 判断是否活着的 */
	public boolean isLife(){
		return state==LIFE;
	}
	/** 判断是否死了的 */
	public boolean isDead(){
		return state==DEAD;
	}
	/** 判断是否删除的 */
	public boolean isRemove(){
		return state==REMOVE;
	}
	
	/** 画对象 g:画笔 */
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
	}
	
}















