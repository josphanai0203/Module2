package case_study.model;

public abstract class Facility {
	protected String serviceCode ;
	protected String serviceName;
	protected int area;
	protected int ventPrice;
	protected int maxUser;
	protected String ventType;
	public Facility(String serviceCode, String serviceName, int area, int ventPrice, int maxUser, String ventType) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.area = area;
		this.ventPrice = ventPrice;
		this.maxUser = maxUser;
		this.ventType = ventType;
	}
	
	
	
	
}
