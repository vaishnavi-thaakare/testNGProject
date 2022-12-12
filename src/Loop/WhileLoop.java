package Loop;

public class WhileLoop {
	public static void main(String[] args) {
		// Printing the number from 0 to 10 
		int a=0;
		while (a<=10) {
			//System.out.println(a);
			a++;
		}
		
		// Printing the even numbers
        int num=0;
        while (num<=10) {
        	if (num%2==0) {
        		//System.out.println(num);
        	}	
        	num++;
        }
      
        //Printing odd numbers
        int odd=0;
        while (odd<=10) {
        	if (odd%2!=0) {
        		System.out.println(odd);
        	}
        	odd++;
        }
	}

}
