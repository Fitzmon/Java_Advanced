package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;
	private String label;

	public CD(String title, String artist, int numofTracks, int playingTime, String label) {
		super(title,playingTime,false);  //从父类中得到title的值
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.label = label;
//		this.playingTime = playingTime;
//		this.label = label;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("Stone Cafe", "Leah Dou", 11, 43, "Gray Waters");
		cd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("CD：");
		super.print();
		System.out.println(" | "+artist);
	}

}
