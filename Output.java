import java.util.*;
import java.io.*;



public class Output{

	public static void print_data() throws Exception{
		PrintStream	po=new PrintStream(new File("output.txt"));	
		System.setOut(po);
		System.out.println("cool");
	}

	public static void main(String args[]){
		System.out.println("Bharat");
		try{
			print_data();	
		}
		catch(Exception e){
		}
		
	}

}