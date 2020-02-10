import epam.Calculator;
import java.util.*;
public class Operation{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		int a,b,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------CALCULATOR--------");
		System.out.println("Options:");
		System.out.println("+ : Addition");
		System.out.println("- : Subtraction");
		System.out.println("* : Multiplication");
		System.out.println("/ : Division");
		System.out.println("@ : exit");
		
		System.out.print("Enter your option:");
		char ch = sc.next().charAt(0);

		while(ch != '@'){
			System.out.print("Operand 1:");
			a = sc.nextInt();
			System.out.print("Operand 2:");
			b = sc.nextInt();

			switch(ch){
				case '+':{
					res = c.add(a,b);
					break;
				}

				case '-':{
					res = c.sub(a,b);
					break;
				}

				case '*':{
					res = c.mul(a,b);
					break;
				}

				case '/':{
					res = c.div(a,b);
					break;
				}
			}
			System.out.println("result is: " + res);
			System.out.println("Enter your choice:");
			ch = sc.next().charAt(0);
		}
		sc.close();

	}
}