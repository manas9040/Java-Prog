package CutomizedCheckedException;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) throws UnderAgeException {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Age : ");
	int age=s.nextInt();
	try {
		  if (age<18) {
			throw new UnderAgeException();
		  }
		 else{
			System.out.println("You are Eligible to vote");
		  }
	} catch ( UnderAgeException e) {
		
		e.printStackTrace();
	}
	System.out.println("***VOTE EVERYONE***");

	}

}
