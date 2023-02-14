package lePhuocThai;

import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào 1 mảng số nguyên, tìm giá trị lớn nhất và nhỏ nhất của mảng
 * @author THAI
 *
 */
public class Bai15 {
	public static void Nhapmang(int array[],int n){
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        array[i] =sc.nextInt();
	    }
	}
	public static void Xuatmang(int array[],int n){
		for (int i = 0; i < n; i++) {
			 System.out.print(array[i] + "\t");
	    }
	}
	public static int Timmax(int array[],int n) {
		int max=array[0];
		for (int i = 0; i < n; i++){
			if(max<array[i])
				max=array[i];
		}
		return max;
	}
	public static int Timmin(int array[],int n) {
		int min=array[0];
		for (int i = 0; i < n; i++){
			if(min>array[i])
				min=array[i];
		}
		return min;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng: ");
		n=sc.nextInt();
		int array[]=new int[n];
		Nhapmang(array, n);
		Xuatmang(array, n);
	
		System.out.println("Gia tri lon nhat trong mang la :"+Timmax(array, n));
		System.out.println("Gia tri lon nhat trong mang la :"+Timmin(array, n));

}
}
