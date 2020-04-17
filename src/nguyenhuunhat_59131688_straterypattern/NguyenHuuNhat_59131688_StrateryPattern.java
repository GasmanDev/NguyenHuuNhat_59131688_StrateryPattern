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
import BT2.IThanhToan;
import BT2.ThanhToanCOD;
import BT2.ThanhToanOnline;

/**
 *
 * @author MSI
 */
public class NguyenHuuNhat_59131688_StrateryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        HangHoa h1 = new HangHoa();
        
    }
    
}
