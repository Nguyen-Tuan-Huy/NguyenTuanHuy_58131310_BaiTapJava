/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

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
        ChuyenXeNgoaiThanh cx1 = new ChuyenXeNgoaiThanh("Khanh Hoa", 2, "KH0001", "Nguyen Van Minh", "79N1-1234", 100);
        ChuyenXeNoiThanh cx2 = new ChuyenXeNoiThanh(20, 4, "M00001", "Tran Van Day", "75D1-62561", 300);
        ChuyenXeNgoaiThanh cx3 = new ChuyenXeNgoaiThanh("Binh Dinh", 4, "BD0005", "Tran Nguyen", "79N2-11434", 250);
        ChuyenXeNoiThanh cx4 = new ChuyenXeNoiThanh(20, 4, "M00002", "Le Van Luyen", "75N4-5561", 100);
        ChuyenXeNgoaiThanh cx5 = new ChuyenXeNgoaiThanh("Hai Phong", 3, "HP0052", "Le Mi Kim", "79N1-1234", 400);
        ChuyenXeNoiThanh cx6 = new ChuyenXeNoiThanh(20, 4, "M00003", "Nguyen Tuan Tai", "71D1-65961", 300);
        IQuanLy qlcx = new QuanLyChuyenXe();
        qlcx.themChuyenXe(cx1);
        qlcx.themChuyenXe(cx2);
        qlcx.themChuyenXe(cx3);
        qlcx.themChuyenXe(cx4);
        qlcx.themChuyenXe(cx5);
        qlcx.themChuyenXe(cx6);
        qlcx.inDSChuyenXe();
        System.out.println("\nTong doan thu cua xe noi thanh: " + qlcx.tinhDTXeNoiThanh());
        System.out.println("\nTong doan thu cua ca hai xe: " + qlcx.tongDTHaiLoaiXe());
    }
    
}
