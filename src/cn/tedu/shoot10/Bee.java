package cn.tedu.shoot10;
import java.util.Random;
import java.awt.image.BufferedImage;
/** 小蜜蜂: 是飞行物，也是奖励 */
public class Bee extends FlyingObject implements Award {
	private static BufferedImage[] images; //图片数组
	static{
		images = new BufferedImage[5]; //5张图片
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bee"+i+".png");
		}
	}
	
	private int xSpeed; //x坐标移动速度
	private int ySpeed; //y坐标移动速度
	private int awardType; //奖励类型(0或1)
	/** 构造方法 */
	public Bee(){
		super(60,50);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2); //0到1之间的随机数
	}
	
	/** 重写step() */
	public void step(){
		x+=xSpeed; //x+(向左或向右)
		y+=ySpeed; //y+(向下)
		if(x<=0 || x>=World.WIDTH-this.width){ //x<=0或x>=(窗口宽-蜜蜂宽)时，表示已经到两边了，则往回弹
			xSpeed*=-1; //修改xSpeed的正负值
		}
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
		return this.y>=World.HEIGHT; //小蜜蜂的y>=窗口的高，即为越界了
	}
	
	/** 重写getType()获取奖励类型 */
	public int getType(){
		return awardType; //返回奖励类型
	}
	
}













