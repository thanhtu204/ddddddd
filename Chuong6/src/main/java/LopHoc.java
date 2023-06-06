/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class LopHoc {
    private String tenLop;
    private Khoa Khoa;

    public LopHoc(String tenLop, Khoa Khoa) {
        this.tenLop = tenLop;
        this.Khoa = Khoa;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Khoa getKhoa() {
        return Khoa;
    }

    public void setKhoa(Khoa Khoa) {
        this.Khoa = Khoa;
    }
    
    
}

