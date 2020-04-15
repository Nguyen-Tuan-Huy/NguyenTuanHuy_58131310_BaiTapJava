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
public class NhanVien {
    String ten, diachi;
    int tuoi, tonggiolam;
    double tienluong;
    // Constructor

    public NhanVien() {
    }
    
    public NhanVien(String ten, String diachi, int tuoi, int tonggiolam, double tienluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.tonggiolam = tonggiolam;
        this.tienluong = tienluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTonggiolam() {
        return tonggiolam;
    }

    public void setTonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }
    
    public String getThongTin(){
        return "\nTen: " + ten
                + "\nTuoi: " + tuoi 
                + "\nDia chi: " + diachi 
                + "\nTien luong: " + tienluong
                + "\nTong so gio lam: " + tonggiolam
                + "\nTien thuong: " + tinhThuong();
    }
    public double tinhThuong(){
        if(tonggiolam >= 200 )
            return tienluong * 0.2;
        else
            if(tonggiolam < 200 && tonggiolam >= 100)
                return tienluong * 0.1;
            else
                return 0;
    }
}
