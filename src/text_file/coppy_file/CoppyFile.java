package text_file.coppy_file;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CoppyFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập địa chỉ file muốn sao chép :");
		String originPath = sc.nextLine();
		System.out.println("Nhập địa chỉ vị trí muốn lưu :");
		String tagetPath = sc.nextLine();
		try {
			File file = new File(originPath);
			File file_coppy = new File(tagetPath);
			Files.copy(file.toPath(), file_coppy.toPath());
			System.out.println("Độ dài file : " + file.length());

		} catch (FileAlreadyExistsException e) {
			System.out.println("file da ton tai");
		}
		 catch (Exception e) {
			System.out.println("file bạn chọn không có");

	}
}}
