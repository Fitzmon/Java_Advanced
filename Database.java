package dome;

import java.util.ArrayList;

public class Database {
	/* 代码重复 */
	// private ArrayList<CD> listCD = new ArrayList<CD>();
	// private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();

	// public void add(CD cd) {
	// listCD.add(cd);
	// }
	//
	// public void add(DVD dvd) { // 重载
	// listDVD.add(dvd);
	// }
	public void add(Item item) {
		listItem.add(item);
	}

	public void list() {
		// for (CD cd : listCD) {
		// cd.print();
		// }
		// for (DVD dvd : listDVD) {
		// dvd.print();
		// }
		for (Item item : listItem) {
			item.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("Stone Cafe", "Leah Dou", 11, 43, "Gray Waters"));
		db.add(new CD("丑奴儿", "草东没有派对", 12, 0, "StreetVoice"));
		db.add(new DVD("Call Me by Your Name", "Luca Guadagnino", 0, "SonyClassic"));
		db.add(new MP3("暖暖","梁静茹",4,"亲亲"));
		db.list();
	}

}
