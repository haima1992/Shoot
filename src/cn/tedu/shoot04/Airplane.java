package cn.tedu.shoot04;
import java.util.Random;
/** 小敌机: 是飞行物 */
public class Airplane extends FlyingObject {
	int speed; //移动速度
	/** 构造方法 */
	Airplane(){
		super(49,36);
		speed = 2;
	}
	
	/** 重写step() */
	void step(){
		System.out.println("小敌机的y坐标移动了"+speed);
	}
}













