package entityclassassignment1;

public class Student {
	int sid;
	String sname;
	int smark;
	String scity;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmark() {
		return smark;
	}
	public void setSmark(int smark) {
		this.smark = smark;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smark=" + smark + ", scity=" + scity + "]";
	}
	

}
