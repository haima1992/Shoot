package cn.tedu.shoot09;
//测试
public class Test {
	public static void main(String[] args) {
		Airplane a = new Airplane();
		a.x = 150;
		a.y = 250;
		Bullet b = new Bullet(150,240);
		
		boolean flag = a.hit(b);
		System.out.println(flag);
	}
}



















