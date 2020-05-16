package cn.tedu.shoot08;
import java.awt.image.BufferedImage;
/** 小敌机: 是飞行物，也能得分 */
public class Airplane extends FlyingObject implements Enemy {
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
		y+=speed; //y+(向下)
	}
	
	int index = 1; //轮换图片的起始下标
	/** 重写getImage()获取图片 */
	public BufferedImage getImage(){ //每10毫秒走一次
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[index++];
			if(index==images.length){
				state=REMOVE;
			}
			return img;
		}
		return null;
		/* 
		 *                   index=1
		 * 10M img=images[1] index=2 return(images[1])
		 * 20M img=images[2] index=3 return(images[2])
		 * 30M img=images[3] index=4 return(images[3])
		 * 40M img=images[4] index=5 return(images[4])
		 * 50M 不走isDead()里面了，因为state已经REMOVE
		 */
	}

	/** 重写outOfBounds()检测越界 */
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT; //小敌机的y>=窗口的高，即为越界了
	}
	
	/** 重写getScore()得分 */
	public int getScore(){
		return 1; //打掉小敌机得1分
	}
}













