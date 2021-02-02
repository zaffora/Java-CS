package zaffora;

public class Airport {

	public String code;
	public String name;
	private String city;
	
	
	public Airport(String code, String name, String city) {
		this.code = code;
		this.name = name;
		this.city = city;
	}
	public Airport(String code) {
		this.code = code;
		this.name = this.city = null;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return code + " (" + name + ")";
	}
	
	
}
