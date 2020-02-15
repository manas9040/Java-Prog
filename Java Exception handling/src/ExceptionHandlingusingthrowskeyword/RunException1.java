package ExceptionHandlingusingthrowskeyword;

import java.io.FileNotFoundException;

public class RunException1 {

	public static void main(String[] args){
		Exception1 obj=new Exception1();
		try {
			obj.readdata();
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		try {
			obj.writedata();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		System.out.println("hello");
	}
	

}
