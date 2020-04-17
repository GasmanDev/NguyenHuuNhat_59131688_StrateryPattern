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

/**
 *
 * @author MSI
 */
public class NguyenHuuNhat_59131688_StrateryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context bt1 = new Context();
        ITinh phepCong = new Cong();
        ITinh phepTru = new Tru();
        bt1.setTinhToan(phepCong);
        System.out.println("Kết quả phép tính 75 + 12 = " + bt1.tinh(75, 12));
        bt1.setTinhToan(phepTru);
        System.out.println("Kết quả phép tính 54 - 78 = " + bt1.tinh(54, 78));
    }
    
}
