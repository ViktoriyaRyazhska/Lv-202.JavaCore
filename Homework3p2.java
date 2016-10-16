
public class Homework3p2 {

	public static void main(String[] args) {
		Employee workers[] = {new SalariedEmployee("Bob", 2334, 160, 2), new ContractEmployee("John", 123435, 1600)};
		for (Employee worker: workers){
			System.out.println("Name: "+worker.name+" | ID: "+worker.employeeID+" | Average paymant: "+worker.calculacePay());
		}
	}

}
class Employee implements calculacePayInt{
	public int calculacePay(){return 0;};
	int employeeID;
	String name;
}
class SalariedEmployee extends Employee implements calculacePayInt{
	int socialSecurityNumber;
	int Hours;
	int HourRate;
	SalariedEmployee (String name, int ID, int hours, int rate){
		this.name=name;
		this.socialSecurityNumber = ID;
		employeeID=socialSecurityNumber;
		this.Hours=hours;
		this.HourRate=rate;
	}
	public int calculacePay(){
		return (this.HourRate*this.Hours);
	}
}
class ContractEmployee extends Employee implements calculacePayInt{
	int federalTaxIdmember;
	int Payment;
	ContractEmployee (String name, int ID,int pay){
		this.name=name;
		this.federalTaxIdmember=ID;
		employeeID=federalTaxIdmember;
		this.Payment=pay;
	}
	public int calculacePay(){
		return (this.Payment);
	}
}