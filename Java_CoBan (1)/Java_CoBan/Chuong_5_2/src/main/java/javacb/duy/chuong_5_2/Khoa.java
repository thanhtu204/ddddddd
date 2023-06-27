/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacb.duy.chuong_5_2;

/**
 *
 * @author Administrator
 */
public class Khoa {
    private String tenKhoa;
    private String diaChi;

    public Khoa(String tenKhoa, String diaChi) {
        this.tenKhoa = tenKhoa;
        this.diaChi = diaChi;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
