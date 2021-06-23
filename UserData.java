package apk;

public class UserData {
	String ime;
	String prezime;
	String faks;
	Boolean imaZ = false;
	prolaz pro;
	String imeZ;
	Boolean jb;
	Integer intl;
	Integer sng;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getFaks() {
		return faks;
	}
	public void setFaks(String faks) {
		this.faks = faks;
	}
	public prolaz getPro() {
		return pro;
	}
	public void setPro(prolaz pro) {
		this.pro = pro;
	}
	public String getImeZ() {
		return imeZ;
	}
	public void setImeZ(String imeZ) {
		this.imeZ = imeZ;
	}
	public Boolean getJb() {
		return jb;
	}
	public void setJb(Boolean jb) {
		this.jb = jb;
	}
	public Integer getIntl() {
		return intl;
	}
	public void setIntl(Integer intl) {
		this.intl = intl;
	}
	public Integer getSng() {
		return sng;
	}
	public void setSng(Integer sng) {
		this.sng = sng;
	}
	
	public Boolean getImaZ() {
		return imaZ;
	}
	public void setImaZ(Boolean imaZ) {
		this.imaZ = imaZ;
	}
	@Override
	public String toString() {
		return "UserData firstName= " + ime + ", lastName= " + prezime
		        +" Faks: " + faks + " Sport:" + imaZ + " ImeSporta: " + imeZ == null ? "ima":  " nema zensku" +  "\n";
	}
}
