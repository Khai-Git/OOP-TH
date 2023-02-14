package voCongTuanAnh;

import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào 1 mảng số nguyên, 
 * tìm giá trị lớn nhất và nhỏ nhất của mảng.
 * @author TUAN ANH
 *
 */
public class Bai15 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		do {
		    System.out.println("Nhap n phan tu ");
		    n = sc.nextInt();
		} while (n < 0);
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap phan tu thu "+ i + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Gia tri lon nhat trong mang:  "+timMax(arr));
		System.out.println("Gia tri nho nhat trong mang:  "+timMin(arr));
	}
     
     // ham tim  gai tri lon nhat
     public static int timMax(int arr[]) {
    	 int max = arr[0];
    	 for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
    	 return max;
     }
     
     // ham tim gia tri nho nhat
     public static int timMin(int arr[]) {
    	 int min = arr[0];
    	 for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
    	 return min;
     }
     
}
