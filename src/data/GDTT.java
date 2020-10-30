package data;

public class GDTT extends GiaoDich implements DonGia{
	private int tiGia;
	private String lTien;
	public GDTT(String ma, String ngay, int donGia, int soLuong, int tiGia, String lTien) {
		super(ma, ngay, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.tiGia=tiGia;
		this.lTien=lTien;
	}
	public int getTiGia() {
		return tiGia;
	}
	public void setTiGia(int tiGia) {
		this.tiGia = tiGia;
	}
	public String getlTien() {
		return lTien;
	}
	public void setlTien(String lTien) {
		this.lTien = lTien;
	}
	@Override 
	public double getTien()
	{
		if(lTien=="USD"||lTien=="Euro") return getSoLuong()*getDonGia()*tiGia;
		else return getSoLuong()*getDonGia();
	}

	@Override
	public String toString() {
		return getMa()+"\t"+getNgay()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+tiGia+"\t"+lTien;
	}
}
