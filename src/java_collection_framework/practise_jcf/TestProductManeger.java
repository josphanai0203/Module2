package java_collection_framework.practise_jcf;

import java.util.Scanner;

public class TestProductManeger {
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		int option;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("============== Menu =================");
			System.out.println("1.Display Product List");
			System.out.println("2.Add Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Fix Product");
			System.out.println("5.Search");
			System.out.println("6.Quit");
			System.out.println("============== End =================");
			System.out.println("Select your option :");
			
			option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				pm.display();
				break;
			case 2:
				System.out.println("Product Name :");
				String name = sc.nextLine();
				System.out.println("Product Id :");
				String id = sc.nextLine();
				System.out.println("Product Cost :");
				String cost = sc.nextLine();
				Product p = new Product(name, id, Integer.parseInt(cost));
				pm.add(p);
				pm.sort();
				break;
			case 3:
				System.out.println("Product Id :");
				String deleteId = sc.nextLine();
				pm.delete(deleteId);
				break;
			case 4:
				System.out.println("Product Id :");
				String fixId = sc.nextLine();
				pm.fixProduct(fixId);
				break;
			case 5:
				System.out.println("Product Id :");
				String searchId = sc.nextLine();
				if(pm.search(searchId)) {
					System.out.println("The Product is exist");
				}else{
					System.out.println("The Product not exist");
					
				};
				break;
			default:
				break;
			}
			if(option==6) {
				break;
			}
		}
	}
}
