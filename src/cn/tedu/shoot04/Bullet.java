package cn.tedu.shoot04;
/** 子弹: 是飞行物 */
public class Bullet extends FlyingObject {
	int speed; //移动速度
	/** 构造方法 */
	Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	
	/** 重写step() */
	void step(){
		System.out.println("子弹的y坐标移动了"+speed);
	}
	
}










