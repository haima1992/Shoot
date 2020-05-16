package cn.tedu.shoot04;
import java.util.Random;
/** 大敌机: 是飞行物 */
public class BigAirplane extends FlyingObject {
	int speed; //移动速度
	/** 构造方法 */
	BigAirplane(){
		super(69,99);
		speed = 2;
	}
	
	/** 重写step() */
	void step(){
		System.out.println("大敌机的y坐标移动了"+speed);
	}
}














