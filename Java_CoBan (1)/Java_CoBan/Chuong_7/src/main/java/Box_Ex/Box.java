/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box_Ex;

/**
 *
 * @author Administrator
 */
public class Box<T> {
    private T n;

    public Box(T n) {
        this.n = n;
    }

    public T getN() {
        return n;
    }

    public void setN(T n) {
        this.n = n;
    }
    public void xuatThongTin(){
        System.out.println("Gia tri: "+this.n);
    }
}
