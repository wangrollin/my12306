
public class Detail {
	private int index;
	private String station;
	private String come;
	private String stay;
	private String go;
	
	public Detail(int index,String station,String come,String stay,String go) {
		this.index = index;
		this.station = station;
		this.come = come;
		this.go = go;
		this.stay = stay;
	}

	public int getIndex() {
		return index;
	}

	public String getStation() {
		return station;
	}

	public String getCome() {
		return come;
	}

	public String getStay() {
		return stay;
	}

	public String getGo() {
		return go;
	}
	
}
