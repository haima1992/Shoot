package cn.tedu.shoot01;
/** 整个世界 */
public class World {
	Sky sky;
	Hero hero;
	Airplane a1;
	Airplane a2;
	BigAirplane ba1;
	BigAirplane ba2;
	Bee b1;
	Bee b2;
	Bullet bt1;
	Bullet bt2;
	
	void action(){ //测试代码
		sky = new Sky();
		sky.width = 400;
		sky.height = 700;
		sky.x = 0;
		sky.y = 0;
		sky.y1 = -700;
		sky.speed = 1;
		sky.step();
		
		hero = new Hero();
		hero.width = 97;
		hero.height = 124;
		hero.x = 140;
		hero.y = 400;
		hero.life = 3;
		hero.doubleFire = 0;
		hero.step();
		hero.moveTo(100,200);
		
		a1 = new Airplane();
		a1.width = 49;
		a1.height = 36;
		a1.x = 58;
		a1.y = 145;
		a1.speed = 2;
		a1.step();
		
		
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}






















