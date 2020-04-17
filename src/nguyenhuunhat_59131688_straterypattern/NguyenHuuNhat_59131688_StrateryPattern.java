/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhuunhat_59131688_straterypattern;

import BT1.Cong;
import BT1.Context;
import BT1.ITinh;
import BT1.Tru;
import BT2.GioHang;
import BT2.HangHoa;
import BT2.IThanhToan;
import BT2.ThanhToanCOD;
import BT2.ThanhToanOnline;
import BT3.ISoSanh;
import BT3.QLSV;
import BT3.SinhVien;
import BT3.SoSanhTheoDiem;
import BT3.SoSanhTheoTen;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author MSI
 */
public class NguyenHuuNhat_59131688_StrateryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // Bai tap 1
        Context bt1 = new Context();
        ITinh phepCong = new Cong();
        ITinh phepTru = new Tru();
        bt1.setTinhToan(phepCong);
        System.out.println("Kết quả phép tính 75 + 12 = " + bt1.tinh(75, 12));
        bt1.setTinhToan(phepTru);
        System.out.println("Kết quả phép tính 54 - 78 = " + bt1.tinh(54, 78));
        // Bai tap 2
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        IThanhToan thanhToanOnline = new ThanhToanOnline();
        IThanhToan thanhToanCOD = new ThanhToanCOD();
        
        gh1.setHinhThucTT(thanhToanOnline);
        gh2.setHinhThucTT(thanhToanCOD);
        
        HangHoa h1 = new HangHoa("Iphone X", 14000000, "Iphone X");
        HangHoa h2 = new HangHoa("Iphone Xr", 12000000, "Iphone Xr Đỏ");
        HangHoa h3 = new HangHoa("Airpod", 4000000, "Tai nghe Airpod");
        
        gh1.themHang(h1);
        gh1.themHang(h2);

        gh2.themHang(h3);
        
        System.out.println("Giỏ hàng 1, phương thức thanh toán Online");
        gh1.inGioHang();
        System.out.println("Tổng tiền hàng: " + gh1.tongTienHang() + " VND");
        System.out.println("Tổng tiền thanh toán: " + (int)gh1.tongThanhToan() + " VND");
        
        System.out.println("Giỏ hàng 2, phương thức thanh toán COD");
        gh2.inGioHang();
        System.out.println("Tổng tiền hàng: " + gh2.tongTienHang() + " VND");
        System.out.println("Tổng tiền thanh toán: " + (int)gh2.tongThanhToan() + " VND");
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
