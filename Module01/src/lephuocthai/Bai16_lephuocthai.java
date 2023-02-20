package lephuocthai;

import java.util.Scanner;

/**
 * Viết chương trình xuất ra các hình sau (dùng cấu trúc lặp):
 * @author THAI
 *
 */
public class Bai16_lephuocthai {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chieu cao hinh tam giac");
		n=sc.nextInt(); 
		int i,j;
		System.out.println("Hinh 1");
		for( i = 0; i < n; i++){
		        for( j = n-i; j < n; j++){
		           System.out.print("* ");
		        }
		        System.out.println("");
		}
		System.out.println("Hinh 2");
		for(i = 0; i < n; i++){
			for(j = n-i; j < n; j++){
				System.out.print("");
	        }
			for(j = i; j < n; j++){
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
		
		System.out.println("Hinh 3");
		for(i = 0; i < n; i++){
	  	    for(j = i; j < n; j++){
	            System.out.print(" ");
	        }
	        for(j = n-i; j < n; j++){
	            System.out.print("* ");
	        }
	        System.out.println("");
	    }
		
	}
	
}
