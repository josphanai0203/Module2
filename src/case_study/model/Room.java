package case_study.model;

public class Room extends Facility {
	private String serviceFree;

	public Room(String serviceCode, String serviceName, double area, int ventPrice, int maxUser, String ventType,
			String serviceFree) {
		super(serviceCode, serviceName, area, ventPrice, maxUser, ventType);
		this.serviceFree = serviceFree;
	}
	
	public String getServiceFree() {
		return serviceFree;
	}

	public void setServiceFree(String serviceFree) {
		this.serviceFree = serviceFree;
	}

	@Override
	public String toString() {
		return "Service Code=" + serviceCode + "\n Service Name=" + serviceName + "\n Area=" + area + "\n Vent Price="
				+ ventPrice + "\n Max User=" + maxUser + "\n Vent Type=" + ventType +"\n Service : "+ serviceFree;
	}
	
}

