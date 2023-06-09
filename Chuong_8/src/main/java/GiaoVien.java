
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class GiaoVien extends NguoiLaoDong{
    
	private int soGV;
	private double tien1hv;
       	public GiaoVien() {
		}
	

    

   

	
	public double getSoGV() {
		return soGV;
	}
	public void setSoGV(int soGV) {
		this.soGV = soGV;
	}
	public double getTien1hv() {
		return tien1hv;
	}
	public void setTien1hv(double tien1hv) {
		this.tien1hv = tien1hv;
	}
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner s = new Scanner(System.in);
                System.out.print("so gio vuot: ");
		this.soGV = s.nextInt();
		System.out.print("Nhap tien mot gio vuot: ");
		this.tien1hv = s.nextInt();
                
	}
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.print("-Thu nhap: "+ThuNhap());
		
	}
	
	@Override
	public double ThuNhap() {
		double tienlcb=this.tienLuongCB();
                double tienvg= (double)this.soGV*this.tien1hv;
                LocalDate ns = LocalDate.now();
               long sonamcongtac= this.ngayVaolam.until(ns,ChronoUnit.YEARS);
                double phuCap= tienlcb*(sonamcongtac*0.01);
                return tienlcb+tienvg+phuCap;
 	}


	
}
