package cinema.model;

public class Bilet {

	private int id;
	private Saat saat;
	private Salon salon;
	private int row;
	private int col;
	
	
	
	public Bilet(int id, Saat saat, Salon salon, int row, int col) {
		super();
		this.id = id;
		this.saat = saat;
		this.salon = salon;
		this.row = row;
		this.col = col;
	}
	
	
	public Bilet(Saat saat, Salon salon, int row, int col) {
		super();
		this.saat = saat;
		this.salon = salon;
		this.row = row;
		this.col = col;
	}


	public int getId() {
		return id;
	}
	public Saat getSaat() {
		return saat;
	}
	public Salon getSalon() {
		return salon;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}

	@Override
	public String toString() {
		return "Bilet [id=" + id + ", saat=" + saat + ", salon=" + salon
				+ ", row=" + row + ", col=" + col + "]";
	}
	
	
	
	
}
