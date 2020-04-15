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
public class SinhVienBiz extends SinhVienPoly{
    
    private double diẹmMarketing;
    private double diẹmSale;

    public SinhVienBiz(double diẹmMarketing, double diẹmSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diẹmMarketing = diẹmMarketing;
        this.diẹmSale = diẹmSale;
    }

    public double getDiẹmMarketing() {
        return diẹmMarketing;
    }

    public void setDiẹmMarketing(double diẹmMarketing) {
        this.diẹmMarketing = diẹmMarketing;
    }

    public double getDiẹmSale() {
        return diẹmSale;
    }

    public void setDiẹmSale(double diẹmSale) {
        this.diẹmSale = diẹmSale;
    }
    
    
    @Override
    
    public double getDiem(){
        return (2* getDiẹmMarketing() + getDiẹmSale()) / 3;
    }
}
