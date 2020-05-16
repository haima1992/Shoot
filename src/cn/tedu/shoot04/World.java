package cn.tedu.shoot04;
import javax.swing.JFrame;
import javax.swing.JPanel;
/** 整个世界 */
public class World extends JPanel {
	Sky sky = new Sky(); //天空
	Hero hero = new Hero(); //英雄机
	FlyingObject[] enemies = {}; //敌人(小敌机、大敌机、小蜜蜂)数组
	Bullet[] bullets = {}; //子弹数组
	
	void action(){ //测试代码
		enemies = new FlyingObject[5];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new BigAirplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new Bee();
		for(int i=0;i<enemies.length;i++){
			FlyingObject f = enemies[i];
			System.out.println(f.x+","+f.y);
			f.step();
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //创建窗口
		World world = new World(); //创建面板
		frame.add(world); //将面板添加到窗口中
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭窗口即退出程序
		frame.setSize(400,700); //设置窗口大小
		frame.setLocationRelativeTo(null); //设置窗口居中显示
		frame.setVisible(true); //设置窗口可见 
		
		world.action(); //启动程序的执行
	}
}






















