package binary_file.copy_binary_file;

import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CoppyBinaryFile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.printf("Enter source file:");
		String sourcePath = in.nextLine();
		System.out.printf("Enter destination file:");
		String destPath = in.nextLine();

		File sourceFile = new File(sourcePath);
		File destFile = new File(destPath);

		try {
			copyFileUsingJava7Files(sourceFile, destFile);
	                //copyFileUsingStream(sourceFile, destFile);
			System.out.printf("Copy completed");
		} catch (IOException ioe) {
			System.out.printf("Can't copy that file");
			System.out.printf(ioe.getMessage());
		}
	}
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {                             
	      Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	 }
}
