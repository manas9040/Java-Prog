package JavaexceptionExamples;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		try {
			if (age<18) {
				throw new UnderAgeException("Not eligible to cast your vote");
				}
			else {
				System.out.println("eligible for voting");
			}
		} catch (UnderAgeException e) {
			
			e.printStackTrace();
		}
		System.out.println("*****VOTE FOR NATION BUILDING******");
		
	}

}
