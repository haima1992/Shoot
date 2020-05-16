package cn.tedu.shoot04;
import java.util.Random;
/** 飞行物 */
public class FlyingObject {
	int width;
	int height;
	int x;
	int y;
	/** 专门给英雄机、天空、子弹提供的 */
	FlyingObject(int width,int height,int x,int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	/** 专门给小敌机、大敌机、小蜜蜂提供的 */
	FlyingObject(int width,int height){
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(400-this.width); //x:0到(400-小敌机宽)之间的随机数
		y = -this.height; //y:负的小敌机的高
	}
	
	/** 飞行物移动 */
	void step(){
		System.out.println("飞行物移动啦!");
	}
}















