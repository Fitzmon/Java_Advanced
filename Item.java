package dome;

public class Item {
	private String title; // 父类中private修饰的成员在子类中不可见
	// protected 可以让子类和同父类一个包内其他类进行访问
	private int playingTime;
	private boolean gotIt = false;
	
	public Item() {
		
	}	
	public Item(String title, int playingTime, boolean gotIt) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(title);
	}
	
}
