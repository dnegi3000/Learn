/**
 * 
 */
package my.work.clencd.func;

/**
 * @author deenegi0
 *
 */
public class Money {

	
	
	public Money calculatePay(Employee e) 
			   throws InvalidEmployeeType {
			       switch (e.type) {
			        /* case COMMISSIONED:
			           return calculateCommissionedPay(e);
			         case HOURLY:
			           return calculateHourlyPay(e);
			         case SALARIED:
			           return calculateSalariedPay(e);*/
			         default:
			           throw new InvalidEmployeeType();
			       }
			     }
}

class Employee {
	
	String name; 
	String type;
	
}


class InvalidEmployeeType extends Throwable{
	
}