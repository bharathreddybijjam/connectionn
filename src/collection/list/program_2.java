package collection.list;
class payment{
	protected double amount;
	public payment(double amount) {
		this.amount=amount;
	}
	public String pay() {
		return "paid amount :" +amount +"using UPI";
	}
}
class debitcard extends payment{
	public debitcard(double amount) {
		super(amount);
		
	}
	public String pay() {
		return "paid amount :" +amount +" using Debit Card";
			}
}
class creditcard extends payment{
	public creditcard(double amount) {
		super(amount);
	}
	public String pay() {
		return "paid amount :" +amount + " using credit Card";
	}
}
class paymentprocess{
	public static<t extends payment> void paymentprocess(t payment) {
		payment.pay();
	}
}
public class program_2 {
	public static void main(String[] args) {
		debitcard d=new debitcard(1000);
		creditcard c=new creditcard(14500);
		System.out.println(d.pay());
		System.out.println(c.pay());
	}

}
