package ExceptionHandlingusingthrowskeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exception1 {
	public void readdata() throws FileNotFoundException{
		FileInputStream fis =new FileInputStream("E:/abc.txt");
		System.out.println(fis);
		
}
	public void writedata() throws FileNotFoundException{
		FileOutputStream fout=new FileOutputStream("E:/xyz.txt");
	}

}
