package voCongTuanAnh;

import java.util.Scanner;

public class Bai16 {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n ;
			do {
			    System.out.println("Nhap n chuoi ");
			    n = sc.nextInt();
			} while (n < 0);
			
			String arr[] = new String[n];
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Nhap phan tu thu "+ i + ": ");
				arr[i] = sc.nextLine();
			}
			
}
}
