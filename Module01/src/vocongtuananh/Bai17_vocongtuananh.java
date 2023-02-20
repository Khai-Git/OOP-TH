package vocongtuananh;

import java.util.Scanner;

public class Bai17_vocongtuananh {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int hight;
		 
		 System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
		 hight = sc.nextInt(); 
		 System.out.println("tam gia a");
		 tamGiaa(hight);
		 System.out.println("\ntam gia b");
		 tamGiab(hight);
		 System.out.println("\ntam gia c");
		 tamGiac(hight);
}
	 
	 public static void tamGiaa(int hight)
	 {
		 for (int i = 1; i <= hight; ++i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
	 }
	 
	 public static void tamGiab(int hight)
	 {
		 for (int i = hight; i >= 1; --i) {
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
	 }
	 
	 public static void tamGiac(int hight) {
		 int k =0;
		 for (int i = 1; i <= hight; ++i, k = 0) {
		      for (int space = 1; space <= hight - i; ++space) {
		        System.out.print("  ");
		      }
		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }
		      System.out.println();
		    }
	 }
}
