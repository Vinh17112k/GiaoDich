package data;

public class GiaoDich {
	private String Ma, Ngay;
	private int donGia,soLuong;
	public GiaoDich(String ma, String ngay, int donGia, int soLuong) {
		super();
		Ma = ma;
		Ngay = ngay;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public String getNgay() {
		return Ngay;
	}
	public void setNgay(String ngay) {
		Ngay = ngay;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
