package case_study.model;

public abstract class Facility {
	protected String serviceCode ;
	protected String serviceName;
	protected double area;
	protected int ventPrice;
	protected int maxUser;
	protected String ventType;
	public Facility(String serviceCode, String serviceName, double area, int ventPrice, int maxUser, String ventType) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.area = area;
		this.ventPrice = ventPrice;
		this.maxUser = maxUser;
		this.ventType = ventType;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getVentPrice() {
		return ventPrice;
	}
	public void setVentPrice(int ventPrice) {
		this.ventPrice = ventPrice;
	}
	public int getMaxUser() {
		return maxUser;
	}
	public void setMaxUser(int maxUser) {
		this.maxUser = maxUser;
	}
	public String getVentType() {
		return ventType;
	}
	public void setVentType(String ventType) {
		this.ventType = ventType;
	}
	
	
	
	
	
}
