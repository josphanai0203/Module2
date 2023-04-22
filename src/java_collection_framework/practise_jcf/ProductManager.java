package java_collection_framework.practise_jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
	ArrayList<Product> productList;

	public ProductManager() {
		this.productList = new ArrayList<>();
	}
	public void add(Product a) {
		this.productList.add(a);
	}
	public void delete(String id) {
		boolean isDelete = false;
		if(this.productList.isEmpty()) {
			System.out.println("Product List is Empty");
		}else {
			for(int i = 0;i<this.productList.size();i++) {
				if(productList.get(i).getId().equals(id)) {
					productList.remove(i);
				}
			}
			if(isDelete) {
				System.out.println("The Product Is Delete");
			}else {
				System.out.println("The Id Product Is Wrong!!!");
			}
		}
		
	}
	public void fixProduct(String id) {
		boolean isFixed = false;
		if(this.productList.isEmpty()) {
			System.out.println("Product List is Empty");
		}else {
			for(int i = 0;i<this.productList.size();i++){
				if(productList.get(i).getId().equals(id)) {
					Scanner sc = new Scanner(System.in);
					System.out.println("New Name: ");
					String newName = sc.nextLine();
					productList.get(i).setName(newName);
					System.out.println("New Id: ");
					String newId = sc.nextLine();
					productList.get(i).setId(newId);
					System.out.println("New Cost: ");
					String newCost = sc.nextLine();
					productList.get(i).setCost(Integer.parseInt(newCost));
					isFixed = true;
				}
			}
			if(isFixed) {
				System.out.println("The Product Is fixed");
			}else {
				System.out.println("The Id Product Is Wrong!!!");
			}
		}
	}
	public void display() {
		for(Product product:this.productList) {
			System.out.println(product);
		}
	}
	public boolean search(String id) {
		if(this.productList.isEmpty()) {
			return false;
		}else {
			boolean isExit = false;
			for(Product product:this.productList) {
				if(product.getId().equalsIgnoreCase(id)) {
					return true;
				}
			}
			return false;
		}
	}
	public void sort() {
		Collections.sort(this.productList, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if(p1.getCost()<p2.getCost()) {
                    return 1;
                }
                return -1;
            }
        });
	}
	
}
