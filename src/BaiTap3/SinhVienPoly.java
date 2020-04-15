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
public abstract class SinhVienPoly {

    String hoTen, nganh;
        
    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem() < 5)
            return "Yeu";
        else
            if(getDiem() >= 5 && getDiem() < 6.5)
                return "Trung binh";
            else
                if(getDiem() >= 6.5 && getDiem() < 7.5)
                    return "Kha";
                else
                    if(getDiem() >= 7.5 && getDiem() < 9)
                        return "Gioi";
                    else
                        return "Xuat sac";
    }
    public void xuat(){
        System.out.println("\nHo ten: " + hoTen 
                + "\nNganh: " + nganh
                + "\nDiem: " + getDiem()
                + "\nHocLuc: " + getHocLuc());
    }
}
