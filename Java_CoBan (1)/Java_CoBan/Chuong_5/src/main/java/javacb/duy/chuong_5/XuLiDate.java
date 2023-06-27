/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5;

/**
 *
 * @author Administrator
 */
//QLSACH theo yêu cầu sau:
//	Tạo class sách gồm các thông tin sau
//		Thuộc tính: tenSach, donGia, namXuatBan, tacGia
//		Phương thức: xuatTenSach, thông tin sách
//				xuatGiaBanSauGiam (double x) với x là phần trăm giảm giá
//                          xuatCungNamXuatBan(Sach s2) trả về true nếu cùng năm, false nếu khác năm
//      Tạo class TacGia gồm các thông tin: hoTen, ngaySinh có kiểu ngày
//      Tạo class Ngay gồm các tt: day,month,year
public class XuLiDate {
    public static void main(String[] args) {
//        MyDate d1 = new MyDate();
//        d1.nhap();
//        d1.xuatNgayThangNam();
        MyDate2 d2 = new MyDate2(25, 5, 2000);
        d2.xuatNgayThangNam();
        MyDate2 d3 = new MyDate2(0, 0, 0);
        d3.xuatNgayThangNam();
    }
}
