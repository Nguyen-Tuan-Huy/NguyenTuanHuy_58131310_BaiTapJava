/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

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
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Nguyen Tuan Huy", "Dien Lac, Dien Khanh, Khanh Hoa", 22, 200, 2000000);
        NhanVien nv3 = new NhanVien("Nguyen Quang Nang", "Tuy Hoa, Phu Yen", 21, 100, 2000000);
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
        System.out.println("\nDS nhan vien:\n");
        IQuanLy qlnv = new QuanLyNhanVien();
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.inDS();
    }
    
}
