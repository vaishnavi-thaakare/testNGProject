package operatorsInJava;

public class LogicalOperator {
	public static void main(String[] args) {
		//Logical Operator   - and , or , not
		int personAge=56;
		int minAge=18;
		int maxAge=60;
		if ( personAge>minAge&& personAge<maxAge) {
			System.out.println(" This person is allowed to take part in the running competition");
		}else {
			System.out.println(" This person is not allowed to take part in this competition.");
		}
		
	}

}
