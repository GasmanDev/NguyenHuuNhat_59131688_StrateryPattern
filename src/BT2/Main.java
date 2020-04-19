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
public class Main {
    public static void main(String[] args) {
        
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
    }
}
