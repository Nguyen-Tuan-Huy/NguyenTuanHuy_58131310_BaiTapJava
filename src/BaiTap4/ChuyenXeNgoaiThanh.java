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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDi;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
    
    @Override
    public void xuat(){
        System.out.println("\nMa so chuyen: " + maSoChuyen
                        + "\nHo ten tai xe: " + hoTenTX
                        + "\nSo xe: " + soXe
                        + "\nNoi den: " + noiDen
                        + "\nSo ngay di: " + soNgayDi
                        + "\nDoanh thu: " + doanhThu);
    }
}
