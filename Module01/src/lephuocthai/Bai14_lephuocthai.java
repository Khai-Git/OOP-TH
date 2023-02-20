package lephuocthai;

import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào 1 mảng số nguyên và kiểm tra xem có giá trị k nào đó hay không.
 * @author THAI
 *
 */
public class Bai14_lephuocthai {
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
	public static int kiemtra(int array[],int k){
		for (int i = 0; i < array.length; i++) {
			 if(array[i]==k)
				 return i;
			 }
			return -1;
	}
	    	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng: ");
		n=sc.nextInt();
		int array[]=new int[n];
		Nhapmang(array, n);
		Xuatmang(array, n);
		
		int k;
		System.out.println("Nhập vào số can tim: ");
		k=sc.nextInt();
		int pos=kiemtra(array, k);
		if(pos == -1){
            System.out.println("Khong tim thay");
        }else{
            System.out.println("Tim thay tai vi tri: " + pos);
        }
			
	}
}
