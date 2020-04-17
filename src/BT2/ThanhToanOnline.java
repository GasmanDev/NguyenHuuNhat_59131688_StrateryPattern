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
public class ThanhToanOnline implements IThanhToan{

    public ThanhToanOnline() {
    }

    @Override
    public double thanhToan(int tienHang) {
        double tienThanhToan = (double)tienHang;
        if (tienHang < 1000000){
            tienThanhToan*=0.95;
        }
        else{
            tienThanhToan*=0.93;
        }
        return tienThanhToan;
    }
    
    
}
