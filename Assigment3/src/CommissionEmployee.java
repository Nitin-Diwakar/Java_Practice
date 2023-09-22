
public class CommissionEmployee extends Empolyee{
	double sales;
	double commission;
	public CommissionEmployee(String name, String ssn, double sales, double commission) {
		super (name,ssn);
		this.sales = sales;
		this.commission = commission;
	}
	public double salary() {
		return 1.11;
	}
	public String toString() {
		return  String.valueOf(sales);
	}
}
