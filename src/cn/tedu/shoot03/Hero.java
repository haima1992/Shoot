package cn.tedu.shoot03;
/** 英雄机: 是飞行物 */
public class Hero extends FlyingObject {
	int life;       //命
	int doubleFire; //火力值
	/** 构造方法 */
	Hero(){
		super(97,124,140,400);
		life = 3;
		doubleFire = 0;
	}
	
	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	void moveTo(int x,int y){
		System.out.println("英雄机随着鼠标移动啦!");
	}
	
}














