package case_study.test_case;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Testall {
public static void main(String[] args) {
	String basePath = new File("").getAbsolutePath();
	String path = basePath + "\\src\\case_study\\data\\employee.csv";
	FileWriter fw;
	try {
		fw = new FileWriter(new File(path));
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write(path);
		bf.close();
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(path);
	}
}
