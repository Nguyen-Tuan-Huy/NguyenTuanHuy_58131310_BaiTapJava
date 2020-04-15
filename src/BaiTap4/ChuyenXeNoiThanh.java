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
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int sokmDi, soTuyen;

    public ChuyenXeNoiThanh(int sokmDi, int soTuyen, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.sokmDi = sokmDi;
        this.soTuyen = soTuyen;
    }

    public int getSokmDi() {
        return sokmDi;
    }

    public void setSokmDi(int sokmDi) {
        this.sokmDi = sokmDi;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    @Override
    public void xuat(){
        System.out.println("\nMa so chuyen: " + maSoChuyen
                        + "\nHo ten tai xe: " + hoTenTX
                        + "\nSo xe: " + soXe
                        + "\nSo tuyen: " + soTuyen
                        + "\nSo km di duoc: " + sokmDi
                        + "\nDoanh thu: " + doanhThu);
    }
}
