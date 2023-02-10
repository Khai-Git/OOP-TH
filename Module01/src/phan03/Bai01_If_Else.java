package phan03;
/**
 * Cấu trúc if-else, switch case
 * @author BeekaiPC
 *
 */
public class Bai01_If_Else {
	public static void main(String[] args) {
		int testscore = 76;
		char grade;
		if (testscore >= 90) {
			grade = 'A';
		}
		if (testscore >= 80) {
			grade = 'B';
		}
		if (testscore >= 70) {
			grade = 'C';
		}
		if (testscore >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}