package dome;

public class DVD extends Item{
	private String director;
	private String production;

	public DVD(String title, String director, int playingTime, String production) {
		super(title,playingTime,false);
		this.director = director;
		this.production= production;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("Call Me by Your Name", "Luca Guadagnino", 0, "SonyClassic");
		dvd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD：" );
		super.print(); // 指示去调用父类的print函数
		System.out.println(" | "+director);
	}

}
