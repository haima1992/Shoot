package cn.tedu.shoot06;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
/** 整个世界 */
public class World extends JPanel {
	public static final int WIDTH = 400;  //窗口的宽
	public static final int HEIGHT = 700; //窗口的高
	
	private Sky sky = new Sky(); //天空
	private Hero hero = new Hero(); //英雄机
	private FlyingObject[] enemies = {
		new Airplane(),
		new BigAirplane(),
		new Bee()
	}; //敌人(小敌机、大敌机、小蜜蜂)数组
	private Bullet[] bullets = {
		new Bullet(100,200)
	}; //子弹数组
	
	/** 启动程序的执行 */
	public void action(){
		
	}
	
	/** 重写paint() g:画笔 */
	public void paint(Graphics g){
		sky.paintObject(g);  //画天空
		hero.paintObject(g); //画英雄机
		for(int i=0;i<enemies.length;i++){ //遍历所有敌人
			enemies[i].paintObject(g); //画敌人
		}
		for(int i=0;i<bullets.length;i++){ //遍历所有子弹
			bullets[i].paintObject(g); //画子弹
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //创建窗口
		World world = new World(); //创建面板
		frame.add(world); //将面板添加到窗口中
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭窗口即退出程序
		frame.setSize(WIDTH,HEIGHT); //设置窗口大小
		frame.setLocationRelativeTo(null); //设置窗口居中显示
		frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法 
		
		world.action(); //启动程序的执行
	}

}






















