package map.TreeMapDemo.Comparator;

public class TeamLeader {
	private String tlname,designation;

	public TeamLeader(String tlname, String designation) {
		super();
		this.tlname = tlname;
		this.designation = designation;
	}

	public String getTlname() {
		return tlname;
	}

	public void setTlname(String tlname) {
		this.tlname = tlname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "TeamLeader [tlname=" + tlname + ", designation=" + designation + "]";
	}
	

}
