package case_study.model;

public class Room extends Facility {
	private String serviceFree;

	public Room(String serviceCode, String serviceName, int area, int ventPrice, int maxUser, String ventType,
			String serviceFree) {
		super(serviceCode, serviceName, area, ventPrice, maxUser, ventType);
		this.serviceFree = serviceFree;
	}
}
