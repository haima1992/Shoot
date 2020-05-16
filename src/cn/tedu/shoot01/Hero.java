package cn.tedu.shoot01;
/** 英雄机 */
public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;       //命
	int doubleFire; //火力值
	
	/** 英雄机切换图片 */
	void step(){
		System.out.println("英雄机切换图片啦!");
	}
	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	void moveTo(int x,int y){
		System.out.println("英雄机随着鼠标移动啦!");
	}
	
}














