/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) {
        // Bai tap 1
        Context bt1 = new Context();
        ITinh phepCong = new Cong();
        ITinh phepTru = new Tru();
        bt1.setTinhToan(phepCong);
        System.out.println("Kết quả phép tính 75 + 12 = " + bt1.tinh(75, 12));
        bt1.setTinhToan(phepTru);
        System.out.println("Kết quả phép tính 54 - 78 = " + bt1.tinh(54, 78));
    }
}
