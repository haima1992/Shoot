package cn.tedu.shoot07;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
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
		super(World.WIDTH,World.HEIGHT,0,0);
		y1 = -height;
		speed = 1;
	}
	
	/** 重写step()移动 */
	public void step(){
		y+=speed;  //y+(向下)
		y1+=speed; //y1+(向下)
		if(y>=World.HEIGHT){ //若y>=窗口的高
			y=-World.HEIGHT; //则修改y的值为负的窗口的高
		}
		if(y1>=World.HEIGHT){ //若y1>=窗口的高
			y1=-World.HEIGHT; //则修改y1的值为负的窗口的高
		}
	}
	
	/** 重写getImage()获取图片 */
	public BufferedImage getImage(){
		return image;
	}
	
	/** 重写paintObject()画对象 */
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
	
}

















