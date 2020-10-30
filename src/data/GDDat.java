package data;

public class GDDat extends GiaoDich implements DonGia{
	private int lDat;

	public GDDat(String ma, String ngay, int donGia, int soLuong, int lDat) {
		super(ma, ngay, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.lDat=lDat;
	}

	public int getlDat() {
		return lDat;
	}

	public void setlDat(int lDat) {
		this.lDat = lDat;
	}
	@Override 
	public double getTien()
	{
		return getSoLuong()*getDonGia()*lDat;
	}

	@Override
	public String toString() {
		return getMa()+"\t"+getNgay()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+lDat;
		//Ma\tNgay\tdon gia\tso luong\tloai vang
	}
}
