package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
	private Room currentRoom;
	// 保存字符串与Handler对象之间关系的数据结构
	private HashMap<String,Handler> handlers = new HashMap<String,Handler>();
	
	
	public Game() {
		handlers.put("go", new HandlerGo(this));
		handlers.put("bye",new HandlerBye(this));
		handlers.put("help", new HandlerHelp(this));
		createRooms();
	}

	private void createRooms() {
		Room outside, lobby, pub, study, bedroom;

		// 制造房间
		outside = new Room("城堡外");
		lobby = new Room("大堂");
		pub = new Room("小酒吧");
		study = new Room("书房");
		bedroom = new Room("卧室");

		// 初始化房间的出口
		outside.setExit("east", lobby);
		outside.setExit("south", study);
		outside.setExit("west", pub);
		lobby.setExit("west", outside);
		pub.setExit("east", outside);
		study.setExit("north", outside);
		study.setExit("east", bedroom);
		bedroom.setExit("west", study);
		lobby.setExit("up", pub);
		pub.setExit("down", lobby);

		currentRoom = outside; // 从城堡门外开始
	}

	private void printWelcome() {
		System.out.println();
		System.out.println("欢迎来到城堡！");
		System.out.println("这是一个超级无聊的游戏。");
		System.out.println("如果需要帮助，请输入 'help' 。");
		System.out.println();
		/* 代码复制，新建函數 */
		showPrompt();
	}

	// 以下为用户命令
	public void goRoom(String direction) {
		Room nextRoom = currentRoom.getExit(direction);
		/* 降低类的耦合度 */
		if (nextRoom == null) {
			System.out.println("那里没有门！");
		} else {
			currentRoom = nextRoom;
			/* 代码复制，調用函數 */
			showPrompt();
		}
	}

	public void showPrompt() {
		System.out.println("你在" + currentRoom);
		System.out.print("出口有: ");
		System.out.print(currentRoom.getExitDesc());
		System.out.println();
	}
	
	/* 新建一个函数play来做循环 */
	public void play() {
		Scanner in = new Scanner(System.in);
		/* 命令解析的硬编码，解成框架 */
		while (true) {
			String line = in.nextLine();
			String[] words = line.split(" ");
			// 取出对应的的Handler：HandlerBye/HandlerHelp/HandlerGo
			Handler handler = handlers.get(words[0]);  
			/* 下述代码对任何新的命令均不会改变*/
			String value = "";
			if(words.length>1)
				value = words[1];
			if(handler!=null) {
				handler.doCmd(value);
				if(handler.isBye())
					break;
			}
			/*-----------------------*/
		}
		in.close();
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
		game.play();

		System.out.println("感谢您的光临。再见！");
	}

}
