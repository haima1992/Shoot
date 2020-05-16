# Shoot 飞机大战
## shoot01 
    创建6个对象类，并测试
     - Airplane 小敌机
     - Bee 小蜜蜂
     - BigAirplane 大敌机
     - Bullet 子弹
     - Hero 英雄机
     - Sky 天空
    测试:World类main()方法
## shoot02
    给6个对象类创建构造方法，并测试    
## shoot03
    1.设计小敌机数组、大敌机数组、小蜜蜂数组、子弹数组，并测试
    2.设计FlyingObject超类，6个对象类继承，并测试
    3.给FlyingObject设计两个构造方法，6个对象类分别调用，并测试
## shoot04
    1.将小敌机数组、大敌机数组、小蜜蜂数组，合为FlyingObject数组，并测试
    2.在6个派生类中重写step()，并测试
    3.画窗口    
## shoot05
    1.给类中成员添加访问控制修饰符
    2.给6个派生类添加图片
      1)6个派生类添加static图片属性
      2)在FlyingObject中添加静态方法loadImage()读图片
      3)6个派生类的static块中调用loadImage()获取图片
## shoot06
    1.设计窗口的宽和高为常量，适当地方做修改
    2.画对象:
      步骤:1)准备图片 2)画对象行为 3)World类中重写paint()调用
      1)想画对象需要得到对象的图片，每个对象都能获取图片，
        意味着获取图片的行为为所有派生类所共有的，
    	所以在超类中设计getImage()用于获取对象的图片，
    	每个对象获取图片的行为都不一样，所以设计为抽象方法
        ----在FlyingObject中设计抽象方法getImage()用于获取图片
      2)获取图片时，对象需要在不同的状态下需要获取不同的图片，
        意味着对象需要设计状态(活着的、死了的、删除的)，
        因为每个对象都有状态，所以将状态设计在超类中，
    	状态都是固定的，所以一般状态都设计为常量
    	----在FlyingObject中设计LIFE、DEAD、REMOVE，state当前状态
        获取图片时，每个对象都需要去判断对象的状态值，
    	意味着判断对象状态为派生类共有的行为，
    	所以将判断状态设计在超类FlyingObject中，因为每个对象判断状态的行为都是一样的，所以设计为普通方法
	    ----在FlyingObject中设计isLife()、isDead()、isRemove()判断状态
      3)在派生类中重写getImage()获取图片:
        3.1)天空Sky，直接返回image
        3.2)子弹Bullet:
            3.2.1)若活着呢，返回image
            3.2.2)若死了的，直接删除
        3.3)英雄机Hero:
            3.3.1)若活着呢，返回images[0]和images[1]切换
        3.4)小敌机Airplane:
            3.4.1)若活着的，返回images[0]
            3.4.2)若死了的，返回images[1]到images[4]，4完了删除
        3.5)大敌机BigAirplane:
            ----同小敌机
        3.6)小蜜蜂Bee:
            ----同小敌机
      4)前三步准备好图片了，则可以画对象了，每个对象都能画，
        画对象的行为为共有的行为，所以设计在超类中，
        因为每个对象画的行为都是一样的，所以设计为普通方法
        ----在FlyingObject中设计普通方法paintObject()画对象
      5)因天空需要画两次，所以重写超类的paintObject()
        ----在Sky中重写paintObject()
      6)在World类中重写paint()实现对象
## shoot07
    1.敌人入场:
      1)在World类中设计nextOne()随机生成敌人对象
      2)在World类的定时器中，调用enterAction()实现敌人入场
        在enterAction()中:
    	  每400毫秒获取敌人对象，enemies扩容，装到最后一个元素上
    2.子弹入场:
      1)在Hero类中设计shoot()生成子弹对象
      2)在World类的定时器中，调用shootAction()实现子弹入场
        在shootAction()中:
    	  每300毫秒获取子弹对象，bullets扩容，数组追加
    3.飞行物移动:
      1)在FlyingObject中设计抽象step()，派生类中重写
      2)在World类的定时器中，调用stepAction()实现飞行物移动
        在stepAction()中:
    	  天空动，遍历所有敌人，敌人动，遍历所有子弹，子弹动
## shoot08
    1.英雄机随着鼠标移动:
      1)在Hero中设计moveTo()实现英雄机随着鼠标动
      2)在World类的侦听器中，重写mouseMoved()鼠标移动事件
        在mouseMoved()中:
    	  获取鼠标的x坐标和y坐标，调用moveTo()英雄机随着动
    2.删除越界的飞行物:
      1)在FlyingObject中设计抽象方法outOfBounds()检测越界，
        在6个派生类中分别重写
      2)在World类的定时器中，调用outOfBoundsAction()删除越界，
        在outOfBoundsAction()中:
    	  声明不越界敌人/子弹数组，遍历敌人/子弹数组，
    	  若不越界，则将不越界敌人/子弹对象添加到不越界数组中，
    	  将不越界数组复制到enemeis/bullets中
    3.设计Enemy得分接口，Airplane和BigAirplane实现接口
      设计Award奖励接口，Bee实现接口
## shoot09
    1.子弹与敌人的碰撞:
      1)在FlyingObject中设计hit()实现检测敌人与子弹/英雄机的碰撞
        在FlyingObject中设计goDead()实现飞行物去死
        在Hero中设计addLife()增命、addDoubleFire()增火力
    	借用Airplane与BigAirplane中的getScore()玩家得分
    	借用Bee中的getAwardType()获取奖励类型
      2)在World定时器中,调用bulletBangAction()实现子弹与敌人碰撞
        在bulletBangAction()中:
    	  遍历子弹得子弹，遍历敌人得敌人，判断是否撞上了
    	  若撞上了:
    	    2.1)子弹去死、敌人去死
    	    2.2)判断被撞对象的类型:
    	           若为Enemy则玩家得分
    			   若为Award则英雄机得奖励
    2.画分和画命:
      1)在Hero中设计getLife()获取英雄机的命
      2)在World类的paint()中: 画分、画命
## shoot10
    1.英雄机与敌人的碰撞:
      1)借用FlyingObject类的hit()碰撞行为
        借用FlyingObject类的goDead()去死行为
    	在Hero中设计subtractLife()减命、clearDoubleFire()清空火力值
      2)在World类的定时器中，调用heroBangAction()实现英雄机与敌人的碰撞
        在heroBangAction()中:
    	   遍历敌人获取敌人，判断若撞上了:
    	     敌人去死、英雄机减命、英雄机清空火力值
    2.检测游戏结束:
      1)借用Hero的getLife()获取命行为
      2)在World类的定时器中，调用checkGameOverAction()实现检测游戏结束
        在checkGameOverAction()中:
    	   若英雄机的命数<=0，说明游戏结束了，则...
    3.画状态:
      1)设计4个常量表示4种状态，state表示当前状态
        设计3个静态变量表示3种图片，static块中初始化
        在paint()中:在不同状态下画不同的图片
      2)将一堆action设计为只在运行状态下执行
        将英雄随着鼠标动设计为只在运行状态下执行
      3)重写mouseClicked()鼠标点击:启动变运行，游戏结束先清理现场变启动
        重写mouseExited()鼠标移出:运行变暂停
    	重写mouseEntered()鼠标移入:暂停变运行
