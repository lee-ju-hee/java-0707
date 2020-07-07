package interfaceExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		FileInputStream fis = new FileInputStream("src/interfaceExam/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		
		scan.close();
		fis.close();
		
		Class clazz = Class.forName(className);
		
		A a = new A();
		X x = (X) clazz.newInstance();
		a.setX(x);
		
		a.print();
	}

}

