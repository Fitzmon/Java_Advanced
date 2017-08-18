package castle;

public class Handler {
	protected Game game;
	
	// Handle本身什么都不做，而是做一个基础
	// 后面生成goHandler helpHandler byeHandler等
	public Handler(Game game) {
		this.game = game;
	}
	public void doCmd(String word) {}

	public boolean isBye() {
		return false;
	}
} 
