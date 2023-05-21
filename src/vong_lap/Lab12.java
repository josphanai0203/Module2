
package vong_lap;
import java.util.Scanner;
public class Lab12  {
    private static Scanner scanner = new Scanner(System.in);
    private static int n;
    private static String[] tenCN = new String[10000];
    private static int[] soNV = new int[10000];

    public static void main(String[] args) {
        nhap();
        in();
    }

    public static void nhap() {
        System.out.print("Nhap so luong chi nhanh ban muon nhap :");
        n = Integer.parseInt(scanner.nextLine());
        while (n<5)
        {
            System.out.println("Yeu cau nhap it nhat la 5 chi nhanh. Vui long nhap lai.");
            System.out.print("Nhap so luong chi nhanh ban muon nhap :");
            n = Integer.parseInt(scanner.nextLine());
        }
        tenCN[0]="a";
        tenCN[1]="b";
        tenCN[2]="c";
        tenCN[3]="d";
        soNV[0]=201;
        soNV[1]=401;
        soNV[2]=601;
        soNV[3]=801;
            System.out.print("Ten chi nhanh: ");
            tenCN[4] = scanner.nextLine();
            while (tenCN[4]=="")
            {
                System.out.println("Yeu cau nhap ten Chi nhanh. Vui long nhap lai.");
                System.out.print("Ten chi nhanh: ");
                tenCN[4] = scanner.nextLine();
            }
            System.out.print("So luong nhan vien: ");
            soNV[4] = Integer.parseInt(scanner.nextLine());

            while (!kiemtra(soNV[4])) {
                System.out.println("Yeu cau so luong nhan vien nam trong khoang (200<x<1000). Vui long nhap lai.");
                System.out.print("So luong nhan vien: ");
                soNV[4] = Integer.parseInt(scanner.nextLine());
            }
        
    }

    public static void in() {
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin chi nhanh " + (i + 1) + ":");
            System.out.println("Ten chi nhanh: " + tenCN[i]);
            System.out.println("So luong nhan vien " + soNV[i]);

            int chiPhi = tinh(soNV[i]);
                System.out.println("Chi phi du tru dau tu: " + chiPhi);
        }
    }

    public static int tinh(int soLuongNhanVien) {
        if (soLuongNhanVien > 800) {
            return soLuongNhanVien * 3800;
        } else if (soLuongNhanVien > 600) {
            return soLuongNhanVien * 3000;
        } else if (soLuongNhanVien > 400) {
            return soLuongNhanVien * 1500;
        } else if (soLuongNhanVien > 200) {
            return soLuongNhanVien * 1000;
        } else {
            return -1;
        }
    }

    public static boolean kiemtra(int soLuongNhanVien) {
        return soLuongNhanVien > 200 && soLuongNhanVien < 1000;
    }
}


