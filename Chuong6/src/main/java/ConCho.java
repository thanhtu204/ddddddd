/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class ConCho extends DongVat{
    private String soChan;
    private String sua;

    public String getSoChan() {
        return soChan;
    }

    public void setSoChan(String soChan) {
        this.soChan = soChan;
    }

    public String getSua() {
        return sua;
    }

    public void setSua(String sua) {
        this.sua = sua;
    }

//    public ConCho(String soChan, String sua,String ten,String mau) {
//        this.soChan = soChan;
//        this.sua = sua;
//        super.mau= mau;
//        super.ten=ten;
//    }
    public  void xuatThongtin(){
        super.inThongtin();
        System.out.print("so chan: "+soChan+" --tiengsua: "+sua);
    }
    
}
