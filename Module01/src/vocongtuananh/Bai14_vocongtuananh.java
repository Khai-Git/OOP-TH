package vocongtuananh;

import java.awt.geom.FlatteningPathIterator;
import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào 1 mảng số nguyên 
 * và kiểm tra xem có giá trị k nào đó hay không.
 * @author TUAN ANH
 *
 */
public class Bai14_vocongtuananh {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap n phan tu: ");
			n = sc.nextInt();
		} while (n < 0);
		
		int arr[] = new int[n];
		
		System.out.println("Nhap cac phan tu cho mang: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap phan tu" + i + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Nhap gia tri ban can tim");
		int k = sc.nextInt();
		
		System.out.println("Mang co gia tri can tim hay khong:  "+kiemTrak(arr, k));
	}
    
    public static boolean kiemTrak(int arr[], int k)
    {
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i] == k)
			{
				return true;
			}
		}
    	return false;
    	
    }
}
