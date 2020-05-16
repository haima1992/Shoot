package cn.tedu.shoot04;
/** 天空: 是飞行物 */
public class Sky extends FlyingObject {
	int y1; //第2张图片的y坐标
	int speed; //移动速度
	/** 构造方法 */
	Sky(){
		super(400,700,0,0);
		y1 = -700;
		speed = 1;
	}
	
	/** 重写step() */
	void step(){
		System.out.println("天空的y坐标和y1坐标移动了"+speed);
	}
	
}

















