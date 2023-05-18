package case_study.model;

public class Villa extends Facility{
	private String roomStandard;
	private int areaOfPool;
	private int totalOfFloor;
	public Villa(String serviceCode, String serviceName, int area, int ventPrice, int maxUser, String ventType,
			String roomStandard, int areaOfPool, int totalOfFloor) {
		super(serviceCode, serviceName, area, ventPrice, maxUser, ventType);
		this.roomStandard = roomStandard;
		this.areaOfPool = areaOfPool;
		this.totalOfFloor = totalOfFloor;
	}
	
	

}
