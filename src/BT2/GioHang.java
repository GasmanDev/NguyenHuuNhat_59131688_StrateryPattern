/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;
import java.util.ArrayList;
/**
 *
 * @author MSI
 */
public class GioHang {
    
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
    public GioHang() {
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) 
    {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHang(HangHoa hangHoa)
    {
        dsHangHoa.add(hangHoa);
    }
    
    public int tongTienHang()
    {
        int S = 0;
        for (HangHoa hangHoa : dsHangHoa)
        {
            S += hangHoa.getGia();
        }
        return S;
    }
    
    public double tongThanhToan()
    {
        return hinhThucTT.thanhToan(tongTienHang());
    }
    
    public void inGioHang()
    {
        for (int i = 0; i < dsHangHoa.size(); i++)
        {
            System.out.println((i+1));
            System.out.println(dsHangHoa.get(i).inTTHangHoa());
            
        }
    }
}
