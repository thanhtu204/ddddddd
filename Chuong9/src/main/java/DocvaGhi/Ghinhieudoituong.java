/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocvaGhi;

import java.util.ArrayList;

/**
 *
 * @author KHOACNTT
 */
public class Ghinhieudoituong {

    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "Nguyen thi bach", 17));
        ds.add(new HocSinh("A02", "Nguyen thi Loan", 22));
        ds.add(new HocSinh("A03", "Nguyen Thi Ba`", 18));
        ds.add(new HocSinh("A04", "Huynh Xuan Thanh", 26));
        ds.add(new HocSinh("A01", "Nguyen thi bach", 17));
        ds.add(new HocSinh("A01", "Nguyen thi bach", 17));
    }
}
