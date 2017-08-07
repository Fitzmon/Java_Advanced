package dome;

public class DVD {
	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt = false;
	private String label;

	public DVD(String title, String director, int playingTime, String label) {
		super();
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.label = label;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DVD"+"£º"+title + "£º" + director);
	}

}
