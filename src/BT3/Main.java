/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        
        //BT3
        QLSV qlsv1 = new QLSV();
        QLSV qlsv2 = new QLSV();
        ISoSanh soSanhTheoTen = new SoSanhTheoTen();
        ISoSanh soSanhTheoDiem = new SoSanhTheoDiem();
        qlsv1.setSoSanh(soSanhTheoTen);
        qlsv2.setSoSanh(soSanhTheoDiem);
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Nguyễn Hữu Nhật", formaterDate.parse("16/07/1999"), (float) 8.0);
        SinhVien sv2 = new SinhVien("Nguyễn Hữu", formaterDate.parse("16/07/1999"), (float) 9.0);
        qlsv1.themSinhVien(sv1);
        qlsv1.themSinhVien(sv2);
        qlsv1.sapXep();
        qlsv1.inDS();
        
        qlsv2.themSinhVien(sv1);
        qlsv2.themSinhVien(sv2);
        qlsv2.sapXep();
        qlsv2.inDS();
    }
}
