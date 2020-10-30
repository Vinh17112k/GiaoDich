package quanly;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import data.GDDat;
import data.GDVang;
import data.GDTT;
import data.GiaoDich;
public class QLGD {
	private List<GiaoDich> list;
	private Scanner in;
	public QLGD()
	{
		list=new ArrayList<>();
		in=new Scanner(System.in);
		list.add(new GDVang("EYR","23/15/2014",23,674,"thoi"));
		list.add(new GDVang("reR","23/5/2016",23,645,"vang la"));
		list.add(new GDVang("EYR","23/45/2014",23,674,"vang thoi"));
		list.add(new GDTT("EYR","23/45/2014",23,674,2000,"USA"));
	}
	public GiaoDich data()
	{
		String Ma, Ngay;
		int dongia, soluong;
		System.out.print("Ma: ");
		Ma=in.nextLine();
		while(true)
		{
			System.out.print("Ngay: ");
			Ngay=in.nextLine();
			if(Ngay.matches("d{1,2}/\\d{1,2}/\\d{4}"))
				break;
			else
				System.out.println("Nhap lai: ");
		}
		System.out.print("don gia: ");
		dongia=Integer.parseInt(in.nextLine());
		System.out.print("so luong: ");
		soluong=Integer.parseInt(in.nextLine());
		return new GiaoDich(Ma,Ngay,dongia,soluong);
	}
	public void nhapGDV()
	{
		GiaoDich d=data();
		String lVang;
		System.out.print("loai vang: ");
		lVang=in.nextLine();
		GDVang n=new GDVang(d.getMa(),d.getNgay(),d.getDonGia(),d.getSoLuong(),lVang);
		list.add(n);
	}
	public void nhapGDTT()
	{
		GiaoDich d=data();
		int tigia;
		System.out.print("ti gia: ");
		tigia=Integer.parseInt(in.nextLine());
		String lTien;
		System.out.print("loai tien: ");
		lTien=in.nextLine();
		GDTT n=new GDTT(d.getMa(),d.getNgay(),d.getDonGia(),d.getSoLuong(),tigia,lTien);
		list.add(n);
	}
	public void vietDS()
	{
		System.out.println("Ma\tNgay\tdon gia\tso luong\tloai vang");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof GDVang)
				System.out.println(list.get(i).toString());
		}
		System.out.println("Ma\tNgay\tdon gia\tso luong\ttigia\tloai tien");
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i) instanceof GDTT)
				System.out.println(list.get(i).toString());
		}
	}
	public void sua()
	{
		
	}
	public void xoa()
	{
		
	}
	public void tongGD()
	{
		
	}
	public void hienthiGDTN()
	{
		
	}
	public void hienthiGD()
	{
		
	}
	public void hienthiBE()
	{
		
	}
}
