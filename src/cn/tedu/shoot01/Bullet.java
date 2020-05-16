package cn.tedu.shoot01;
/** 子弹 */
public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int speed; //移动速度
	/** 子弹移动 */
	void step(){
		System.out.println("子弹的y坐标移动了:"+speed);
	}
}










