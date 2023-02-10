package LT_Chuong3.DiemSinhVien;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	
	// Constructor mac dinh
	public DiemSinhVien() {
		maSV = 0;
		hoTen = "Chua biet";
		diemLT = 0;
		diemTH = 0;
	}
	
	//Constructor co mot tham so la ma sv
	public DiemSinhVien(int maSV) {
		super();
		this.maSV = maSV;
	}

	//Constructor co mot tham so la ma sv va ho ten
	public DiemSinhVien(int maSV, String hoTen) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
	}
	
	//Constructor co day du tham so
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "DiemSinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}
}
