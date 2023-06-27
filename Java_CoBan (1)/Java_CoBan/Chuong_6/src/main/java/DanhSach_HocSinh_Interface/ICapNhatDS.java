/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

/**
 *
 * @author Administrator
 */
public interface ICapNhatDS<T>{
    void them(HocSinh hs);
    void xoa(HocSinh hs);
    void in();
}
