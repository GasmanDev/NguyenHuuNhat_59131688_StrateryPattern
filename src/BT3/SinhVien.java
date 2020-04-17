/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.Date;
import java.text.SimpleDateFormat;  
/**
 *
 * @author MSI
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public String inThongTinSV()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        return "Tên sinh viên: " + this.hoTen + "| Ngày sinh: " + formatter.format(this.ngaySinh) + "| Điểm trung bình: " + this.diemTB;
    }
}
