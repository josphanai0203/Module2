package case_study.view;

import case_study.controller.FuramaController;
import case_study.repository.FileRepository;
import case_study.service.FileService;

public class View {
	public static void main(String[] args) {
		FileRepository fileRepository = new FileRepository();
		li
		FileService fileService = new FileService(fileRepository);
		
		
		
		
		
		FuramaController fc = new FuramaController();
		fc.displayMainMenu();
	}
}
