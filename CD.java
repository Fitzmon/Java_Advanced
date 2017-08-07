package dome;

public class CD {
	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt = false;
	private String label;

	public CD(String title, String artist, int numofTracks, int playingTime, String label) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.label = label;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CD"+"£º"+title+"£º"+artist);
	}

}
