package case_study.model;

public class Villa extends Facility{
	private String roomStandard;
	private double areaOfPool;
	private int totalOfFloor;
	public Villa(String serviceCode, String serviceName, double area, int ventPrice, int maxUser, String ventType,
			String roomStandard, double areaOfPool, int totalOfFloor) {
		super(serviceCode, serviceName, area, ventPrice, maxUser, ventType);
		this.roomStandard = roomStandard;
		this.areaOfPool = areaOfPool;
		this.totalOfFloor = totalOfFloor;
	}
	
	public String getRoomStandard() {
		return roomStandard;
	}

	public void setRoomStandard(String roomStandard) {
		this.roomStandard = roomStandard;
	}

	public double getAreaOfPool() {
		return areaOfPool;
	}

	public void setAreaOfPool(double areaOfPool) {
		this.areaOfPool = areaOfPool;
	}

	public int getTotalOfFloor() {
		return totalOfFloor;
	}

	public void setTotalOfFloor(int totalOfFloor) {
		this.totalOfFloor = totalOfFloor;
	}

	@Override
	public String toString() {
		return "Service Code=" + serviceCode + "\n Service Name=" + serviceName + "\n Area=" + area + "\n Vent Price="
				+ ventPrice + "\n Max User=" + maxUser + "\n Vent Type=" + ventType + "\n Room Standard : " + roomStandard +"\n Area Of Pool : "+ areaOfPool + "\n Total Of Floor : "+totalOfFloor ;
	}
	

}
