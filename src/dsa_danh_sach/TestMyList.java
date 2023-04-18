package dsa_danh_sach;

import java.util.ArrayList;

public class TestMyList {
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		System.out.println(list);
		MyList<Integer> sublist = list.clone();
		System.out.println(sublist);		System.out.println(list);
	}
}
