package entities;

public abstract class Taxpayer {

	private String name;
	private Double annualIncome;
	
	public Taxpayer() {
	}

	public Taxpayer(String name, Double annual_income) {
		this.name = name;
		this.annualIncome = annual_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annual_income) {
		this.annualIncome = annual_income;
	}
	
	public abstract Double tax();
}
