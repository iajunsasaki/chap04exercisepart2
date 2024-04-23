package carrentalshop;

public class SalesCar implements IMaintainableVehicle {

	
	private String name;
	
	public void setVehicleName(String name) {
		this.name = name;
	}

	@Override
	public String getVehicleName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;
	}

	private String maintenanceNote = "";
	
	@Override
	public void regularCheckup(String mechanic, String note) {
		// TODO 自動生成されたメソッド・スタブ
			this.maintenanceNote += "整備士：" + mechanic + " " + note + "\r\n";
	}

	@Override
	public String getMaintenanceRecord() {
		// TODO 自動生成されたメソッド・スタブ
		return maintenanceNote;
	}

}
