package PolymorphismDemo;
class Payment
{
	//overloading concept:same method,same name,diferent argument list
	public void makePayment(String cardNumber, double amount) {
		System.out.println("Paid "+amount +"using Card:"+cardNumber);
		
	}
	//overloading
	public void makePayment(String upiId) {
		System.out.println("Paid using UPI "+upiId);
		
	}
}

public class PaymentDemo {

	public static void main(String[] args) {
		Payment p=new Payment();
		p.makePayment("user@upi");//calling method
		p.makePayment("12345A", 2000);
		//method call and definition will link at the time of compilation in overloading so we can say compile time polymorphism or early binfing

	}

}
