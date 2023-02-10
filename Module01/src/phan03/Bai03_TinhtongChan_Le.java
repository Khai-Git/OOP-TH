package phan03;

import java.util.Scanner;

/**
 * Viết chương trình in ra tổng 1+3+5+…+n nếu n là số lẻ, 2+4+6+…+n nếu n là số chẵn.
 * @author BeekaiPC
 *
 */
public class Bai03_TinhtongChan_Le {
	public static void main(String[] args) {
		int tong = 0;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Mời bạn nhập n: ");
		int n =  nhap.nextInt();
		
		if(n % 2 == 0) {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					tong = tong + i;
				}
			}
			System.out.println("Tổng chẵn = " + tong);
		} else {
			for (int i = 0; i <= n; i++) {
				if(i % 2 != 0) {
					tong = tong + i;
				}
			}
			System.out.println("Tổng lẻ = " + tong);
		}
	}
}
