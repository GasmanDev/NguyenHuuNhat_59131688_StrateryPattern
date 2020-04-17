/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author MSI
 */
public class HangHoa {
    String tenHH;
    int gia;
    String moTa;

    public HangHoa() {
    }

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    

    public String getTenHH() {
        return tenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public String inTTHangHoa()
    {
        return "Tên hàng: " + this.tenHH + "|Giá: " + this.gia + "|Mô tả: " + this.moTa +"\n";
    }
    
}
