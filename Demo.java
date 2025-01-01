package coms;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("*****Welcome to Math Lab******");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("6.Enter your Choice please.");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Welcome to Addition");
				System.out.println("Enter the first number :");
				int a1=sc.nextInt();
				System.out.println("Enter the second number :");
				int a2=sc.nextInt();
				System.out.println("Result is : "+(a1+a2));
				break;
			case 2:
				System.out.println("Welcome to Subtraction");
				System.out.println("Enter the first number :");
				int s1=sc.nextInt();
				System.out.println("Enter the second number :");
				int s2=sc.nextInt();
				System.out.println("Result is :"+(s1-s2));
				break;
			case 3:
				System.out.println("Welcome to Multiplication");
				System.out.println("Enter the first number :");
				int m1=sc.nextInt();
				System.out.println("Enter the second number :");
				int m2=sc.nextInt();
				System.out.println("Result is :"+(m1*m2));
				break;
			case 4:
				System.out.println("Welcome to division");
				System.out.println("Enter the first number :");
				int d1=sc.nextInt();
				System.out.println("Enter the second number :");
				int d2=sc.nextInt();
				
				if(d2!=0) {
				System.out.println("Result is :"+(d1/(double)d2));
				}else {
					System.out.println("Error:division by Zero is not allowed...");
				}
				break;
			case 5:
				System.out.println("Exiting the program.Good Bye....");
				break;
				default:
					System.out.println("invalid choice.Please enter the correct choice");
				
			}
		}while(choice!=5);
		
		}
	
		}

		
		


	
