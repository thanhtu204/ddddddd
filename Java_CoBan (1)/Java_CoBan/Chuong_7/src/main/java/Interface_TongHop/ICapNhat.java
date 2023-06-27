/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_TongHop;

import DanhSach_NguoiLaoDong.*;

/**
 *
 * @author Administrator
 */
public interface ICapNhat<T> {
    void them(T a);
    void xoa(T a);
    void xuat();
}
