package test;

public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		person personobj =new person();
		
		personobj.setage(25);
		personobj.getage();
        System.out.println(personobj.getage());	
        
        Student st=new Student();
        
        fulltimeEmployee femployee=new fulltimeEmployee();
        femployee.setBonus(300);
        femployee.setMonth(400);
      
        System.out.println(femployee.calcsalary());
        ParttimeEmployee pemployee= new ParttimeEmployee();
        pemployee.setHours(200);
        System.out.println(pemployee.calcsalary());
        
        cats catobj= new cats();
        catobj.sound();
		

	}

}
