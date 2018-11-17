package NutriSim.Domain.FoodProperties;

public abstract class AmountInComposition {
	
	private double qty;
	
	private String unit;
	
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}


}
