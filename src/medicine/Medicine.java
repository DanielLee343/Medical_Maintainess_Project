package medicine;

import medical.function;

public class Medicine implements function{
	private String medicineCode;
	private String medicineName;
	private String chargeType;
	private String chargeLevel;
	private int highestPrice;
	private boolean needApprove;
	private int frequency;
	private String unit;
	private String specification;
	public Medicine(String medicineCode, String medicineName, String chargeType, String chargeLevel, int highestPrice,
			boolean needApprove, int frequency, String unit, String specification, int days) {
		super();
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
		this.chargeType = chargeType;
		this.chargeLevel = chargeLevel;
		this.highestPrice = highestPrice;
		this.needApprove = needApprove;
		this.frequency = frequency;
		this.unit = unit;
		this.specification = specification;
		this.days = days;
	}
	public Medicine(String medicineCode, String medicineName){

		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
	}
	private int days;
	public String getMedicineCode() {
		return medicineCode;
	}
	public void setMedicineCode(String medicineCode) {
		this.medicineCode = medicineCode;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getChargeLevel() {
		return chargeLevel;
	}
	public void setChargeLevel(String chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
	public int getHighestPrice() {
		return highestPrice;
	}
	public void setHighestPrice(int highestPrice) {
		this.highestPrice = highestPrice;
	}
	public boolean isNeedApprove() {
		return needApprove;
	}
	public void setNeedApprove(boolean needApprove) {
		this.needApprove = needApprove;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public void add() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void delet() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void find() {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void modify() {
		// TODO 自动生成的方法存根
		
	}
	
}
