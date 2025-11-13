package entities;

public class Company extends Taxpayer{

	private Integer numberOfEmployees;
	
	public Company() {
	}

	public Company(String name, Double annual_income, Integer numberOfEmployees) {
		super(name, annual_income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}
	}
}
