package appium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class gobalriable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop=new  Properties();
FileInputStream fis= new FileInputStream("D:\\course download\\appium\\data.properties");

	prop.load(fis);

System.out.println(prop.getProperty("browser"));
	}

}
