package task.epam.Application;
import java.util.*;

public class CalculatorApp {
	
	public static void main(String args[]) {
		
		try(Scanner s = new Scanner(System.in)) {
			
			int cond = 1;
			while(cond == 1) {
				int num1, num2, op;
				System.out.println("Enter Number 1");
				num1 = s.nextInt();
				System.out.println("Enter Number 2");
				num2 = s.nextInt();
				System.out.println("Select one of the Option");
				System.out.println("1.Addition");
				System.out.println("2.Subtraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				System.out.println("5.Remainder(Mod)");
				System.out.println("6.Exit");
				op = s.nextInt();
				switch(op) {
					case 1:
							Addition obj1 = new Addition();
							System.out.println("Addition of " + num1 + " and " + num2 + " is " + obj1.add(num1, num2));
							break;
					case 2:
							Subtraction obj2 = new Subtraction();
							System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + obj2.sub(num1, num2));
							break;
					
					case 3:
							Multiplication obj3 = new Multiplication();
							System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + obj3.mul(num1, num2));
							break;
					case 4:
							Division obj4 = new Division();
							System.out.println("Division of " + num1 + " and " + num2 + " is " + obj4.div(num1, num2));
							break;
					case 5:
							Remainder obj5=new Remainder();
							System.out.println("Remainder of " + num1 + " and " + num2 + " is " + obj5.mod(num1, num2));
							break;
					case 6:
							cond = 0;
							break;
							
						
				
				
				}
			}
		
		}
	}

}
