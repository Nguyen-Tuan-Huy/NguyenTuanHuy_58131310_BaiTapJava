/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author zasx1
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly svpl = new SinhVienIT(9, 8, 9, "Nguyen Tuan Huy", "CNTT");
        SinhVienIT svit = new SinhVienIT(5, 7, 6, "Le Cong Van", "CNTT");
        SinhVienBiz svbz = new SinhVienBiz(4, 3, "Tran Thanh", "Marketing");
        
        svpl.xuat();
        svit.xuat();
        svbz.xuat();
        
    }
    
}
