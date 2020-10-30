package data;

public class GDVang extends GiaoDich implements DonGia{
	private String lVang;

	public GDVang(String ma, String ngay, int donGia, int soLuong,String lVang) {
		super(ma, ngay, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.lVang=lVang;
	}

	public String getlVang() {
		return lVang;
	}

	public void setlVang(String lVang) {
		this.lVang = lVang;
	}
	@Override 
	public double getTien()
	{
		return getSoLuong()*getDonGia();
	}

	@Override
	public String toString() {
		return getMa()+"\t"+getNgay()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+lVang;
		//Ma\tNgay\tdon gia\tso luong\tloai vang
	}
	
}
