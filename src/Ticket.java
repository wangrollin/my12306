
public class Ticket {

	private String name;
	
	private String begin;
	private String end;
	private String through;

	private String seatANDprice;
	private Identity id;
	
	private String city;
	private String time;
	
	public Ticket(String name, String begin, String end, String through, String seatANDprice, Identity id, String city,
			String time) {
		this.name = name;
		this.begin = begin;
		this.end = end;
		this.through = through;
		this.seatANDprice = seatANDprice;
		this.id = id;
		this.city = city;
		this.time = time;
	}

	public String getCity() {
		return city;
	}

	public String getTime() {
		return time;
	}

	public Identity getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBegin() {
		return begin;
	}

	public String getEnd() {
		return end;
	}

	public String getThrough() {
		return through;
	}

	public String getSeatANDprice() {
		return seatANDprice;
	}
	
	
}
