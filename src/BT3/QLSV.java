/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MSI
 */
public class QLSV {
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    ISoSanh soSanh;


    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSinhVien(SinhVien sv)
    {
        dsSV.add(sv);
    }
    
    public void sapXep()
    {
        Collections.sort(dsSV, (o1, o2) -> soSanh.soSanh((SinhVien)o1, (SinhVien)o2));
    }
    
    public void inDS()
    {
        dsSV.forEach(sv -> System.out.println(sv.inThongTinSV()));
    }
    
}
