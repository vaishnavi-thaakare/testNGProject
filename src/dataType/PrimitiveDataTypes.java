package dataType;
import java.util.Arrays;
public class PrimitiveDataTypes {
   /*Two data types  - 1] primitive data type - int, float , boolean , double , short , long, byte
	                    2] non- primitive data type- string, classes, array  */

	public static void main(String[] args) {
		
		int a= 90;
		System.out.println(" This is integer type "+ a);
		float f=90.123456789f;
		System.out.println(" This is float type "+ f);
		boolean b=true;
		System.out.println(" This is boolean "+ b);
		double d=123456789.12345678912345678912345678935546465465656656565565656565656d;
		System.out.println(" Double is "+ d);
		long op=123456789123456789l;
		char cha='o';
		System.out.println("Char is "+ cha);
		byte by=125;
		System.out.println(" The byte is "+ by);
		String st="Vaishnavi";
		System.out.println(" The given string is "+st );
		int ot[]= {1,45,8,5,89,63};
		System.out.println(" The array is "+ Arrays.toString(ot));
		int ol[]=new int[3];
		ol[1]=45;
		ol[2]=78;
		System.out.println(Arrays.toString(ol));
		System.out.println(ol.length);
		
		


		
		
		
	}
	
}
