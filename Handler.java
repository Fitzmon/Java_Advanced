package castle;

public class Handler {
	protected Game game;
	
	// Handle����ʲô��������������һ������
	// ��������goHandler helpHandler byeHandler��
	public Handler(Game game) {
		this.game = game;
	}
	public void doCmd(String word) {}

	public boolean isBye() {
		return false;
	}
}
