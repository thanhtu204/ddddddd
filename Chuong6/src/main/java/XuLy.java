/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class XuLy {

    public static void main(String[] args) {

        HocSinh n1 = new HocSinh("A01", "Huynh Thanh Tu", new LopHoc("12a8", new Khoa("Toan van", "223,222")), 5, 6, new Ngay(25, 10, 2004));
        HocSinh n2 = new HocSinh("A02", "xinkuyda", new LopHoc("12a7", new Khoa("Toan van", "223,222")), 3, 2, new Ngay(26, 2, 2004));
        HocSinh n3 = new HocSinh("A03", "Nguyen Huan Chuong", new LopHoc("12a8", new Khoa("Toan van", "223,222")), 8, 8, new Ngay(25, 10, 2004));

        n1.xuatTenKhoa();
        n2.xuatTenKhoa();
        n3.xuatTenKhoa();
        ;

        System.out.print("diem trung binh n1: " + n1.tinhDiemtb() + "------" + "xep loai");
        n1.tinhXepLoai();
        System.out.print("diem trung binh n2: " + n2.tinhDiemtb() + "------" + "xep loai");
        n2.tinhXepLoai();
        System.out.print("diem trung binh n3: " + n3.tinhDiemtb() + "------" + "xep loai");
        n3.tinhXepLoai();
        System.out.println("Kiem tra ngay sinh n1 giong ngay sinh n2 khong ?" + n1.kiemTraNgaySinh(n2));
        System.out.println("Kiem tra ngay sinh n1 giong ngay sinh n3 khong ?" + n1.kiemTraNgaySinh(n3));
        System.out.println("Kiem tra ngay sinh n2 giong ngay sinh n3 khong ?" + n2.kiemTraNgaySinh(n3));
    }
}
