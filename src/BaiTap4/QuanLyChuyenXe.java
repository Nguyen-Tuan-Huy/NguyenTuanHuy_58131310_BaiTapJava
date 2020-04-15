
package BaiTap4;
import java.util.ArrayList;

public class QuanLyChuyenXe implements IQuanLy{
    private ArrayList<ChuyenXe> qlcx = new ArrayList<>();

    @Override
    public void themChuyenXe(ChuyenXe cx){
        qlcx.add(cx);
    }
        
    @Override
    public void inDSChuyenXe(){
        for(int i = 0; i < qlcx.size(); i++)
            qlcx.get(i).xuat();
    }
    
    @Override
    public double tinhDTXeNoiThanh(){
        double tong = 0;
        for(int i = 0; i < qlcx.size(); i++)
            if(qlcx.get(i) instanceof ChuyenXeNoiThanh)
                tong += qlcx.get(i).getDoanhThu(); 
        return tong;
    }
    
    @Override
    public double tinhDTXeNgoaiThanh(){
        double tong = 0;
        for(int i = 0; i < qlcx.size(); i++)
            if(qlcx.get(i) instanceof ChuyenXeNgoaiThanh)
                tong += qlcx.get(i).getDoanhThu(); 
        return tong;
    }
    @Override
    public double tongDTHaiLoaiXe(){
        double tong = 0;
        for(int i = 0; i < qlcx.size(); i++)
                tong += qlcx.get(i).getDoanhThu(); 
        return tong;
    }

}
