/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    
    private ArrayList<NhanVien> qlnv = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv){    
        qlnv.add(nv);
    }
    @Override
    public void inDS(){
        for(int i = 0; i < qlnv.size(); i++){
            System.out.println(qlnv.get(i).getThongTin());
        }
    }
}
