package cinema.model;

public enum Saat {

	ON(10), ONIKI(12), ONDORT(14), ONALTI(16), ONSEKIZ(18), YIRMI(20), YIRMIIKI(22);
	
	public int hour;
	
	private Saat(int hour){
		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}
	
	
}
