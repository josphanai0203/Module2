package case_study.model;

public class House extends Facility {
	private String roomStandard;
	private int totalOfFloor;
	public House(String serviceCode, String serviceName, int area, int ventPrice, int maxUser, String ventType,
			String roomStandard, int totalOfFloor) {
		super(serviceCode, serviceName, area, ventPrice, maxUser, ventType);
		this.roomStandard = roomStandard;
		this.totalOfFloor = totalOfFloor;
	}
	
}
