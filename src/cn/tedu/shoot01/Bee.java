package cn.tedu.shoot01;
/** 小蜜蜂 */
public class Bee {
	int width;
	int height;
	int x;
	int y;
	int xSpeed; //x坐标移动速度
	int ySpeed; //y坐标移动速度
	int awardType; //奖励类型
	
	/** 小蜜蜂移动 */
	void step(){
		System.out.println("小蜜蜂的x坐标移动了:"+xSpeed+"，y坐标移动了:"+ySpeed);
	}
}













