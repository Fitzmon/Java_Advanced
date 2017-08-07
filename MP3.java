package dome;

public class MP3 extends Item {
	private String singer;
	private String album;

	public MP3(String title, String singer,  int playingTime, String album) {
		super(title,playingTime,false);
		this.singer = singer;
		this.album = album;
	}
	
	public void print() {
		System.out.print("MP3：");
		super.print();
		System.out.println(" | "+singer);
	}
}
