package test;

public class fulltimeEmployee extends Employee {
	
	int bonus;
	int month;
	
	
	
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}




	public void setMonth(int month) {
		this.month = month;
	}




	public  int calcsalary( ) {
		
		return bonus+month;
		
	}

}
