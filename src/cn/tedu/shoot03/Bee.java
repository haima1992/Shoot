package cn.tedu.shoot03;
import java.util.Random;
/** 小蜜蜂: 是飞行物 */
public class Bee extends FlyingObject {
	int xSpeed; //x坐标移动速度
	int ySpeed; //y坐标移动速度
	int awardType; //奖励类型(0或1)
	/** 构造方法 */
	Bee(){
		super(60,50);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2); //0到1之间的随机数
	}
	
}













