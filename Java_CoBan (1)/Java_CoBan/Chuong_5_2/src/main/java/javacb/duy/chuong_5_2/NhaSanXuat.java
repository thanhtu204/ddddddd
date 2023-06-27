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
public class NhaSanXuat {
    private String tenHangPhim;
    private String tenQuocGia;

    public NhaSanXuat(String tenHangPhim, String tenQuocGia) {
        this.tenHangPhim = tenHangPhim;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangPhim() {
        return tenHangPhim;
    }

    public void setTenHangPhim(String tenHangPhim) {
        this.tenHangPhim = tenHangPhim;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
