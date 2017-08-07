package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	
	public void add(DVD dvd) {   // 重载
		listDVD.add(dvd);
	}
	
	public void list() {
		for(CD cd: listCD) {
			cd.print();
		}
		for(DVD dvd:listDVD) {
			dvd.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("Stone Cafe", "Leah Dou", 11, 43, "Nice"));
		db.add(new CD("丑奴儿", "草东没有派对",12 , 0, "StreetVoice"));
		db.add(new DVD("Call Me by Your Name", "Luca Guadagnino", 0, "SonyClassic"));
		db.list();
	}

}
