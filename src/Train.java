
public class Train {
	private String name;
	
	private String begin;
	private String end;
	private String through;
	
	private int softSeat;
	private String softSeatPrice;
	private int hardSeat;
	private String hardSeatPrice;
	private int softBed;
	private String softBedPrice;
	private int hardBed;
	private String hardBedPrice;
	private int stand;
	private String standPrice;
	
	
	
	public Train(String name, String begin, String end, String through,
				int softSeat,int hardSeat,int softBed,int hardBed,int stand,
				String softSeatPrice,String hardSeatPrice,String softBedPrice,String hardBedPrice,String standPrice){
		this.name=name;			this.softSeat=softSeat;		this.softSeatPrice=softSeatPrice;
		this.begin=begin;		this.hardSeat=hardSeat;		this.hardSeatPrice=hardSeatPrice;
		this.end=end;			this.softBed=softBed;		this.softBedPrice=softBedPrice;
		this.through=through;	this.hardBed=hardBed;		this.hardBedPrice=hardBedPrice;
								this.stand=stand;			this.standPrice=standPrice;
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
	public int getSoftSeat() {
		return softSeat;
	}
	public String getSoftSeatPrice() {
		return softSeatPrice;
	}
	public int getHardSeat() {
		return hardSeat;
	}
	public String getHardSeatPrice() {
		return hardSeatPrice;
	}
	public int getSoftBed() {
		return softBed;
	}
	public String getSoftBedPrice() {
		return softBedPrice;
	}
	public int getHardBed() {
		return hardBed;
	}
	public String getHardBedPrice() {
		return hardBedPrice;
	}
	public int getStand() {
		return stand;
	}
	public String getStandPrice() {
		return standPrice;
	}
	
	
	
}
