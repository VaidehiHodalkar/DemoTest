package appium;

import java.io.IOException;
import java.util.ArrayList;

public class Exceldemo2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		Exceldemo d=new Exceldemo();
ArrayList data=d.getdata("Add Profile");

System.out.println(data.get(0));
System.out.println(data.get(1));
System.out.println(data.get(2));

	}

}
